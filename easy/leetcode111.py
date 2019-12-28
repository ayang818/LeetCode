# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def minDepth(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        if root == None:
            return 0
        else:
            return self.again(root)
    def again(self, root):
        if root==None:
            return 0
        else:
            if root.left == None:
                return self.again(root.right)+1
            elif root.right == None:
                return self.again(root.left)+1
            else:
                return min(self.again(root.left),self.again(root.right))+1