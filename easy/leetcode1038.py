# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def dg(self,node):
        if node.right:
            node.val = self.dg(node.right.val)
        else:
            return node.val
        
    def bstToGst(self, root):
        """
        :type root: TreeNode
        :rtype: TreeNode
        """
        #我猜就是使用树的中序遍历
        stack = []
        cur = root
        temp = 0  
        while cur or len(stack) != 0:
            if cur:
                stack.append(cur)
                cur = cur.right
            else:
                cur = stack.pop()
                cur.val += temp
                temp = cur.val
                cur = cur.left
        return root
