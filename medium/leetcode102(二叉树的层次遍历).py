# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def levelOrder(self, root):
        """
        :type root: TreeNode
        :rtype: List[List[int]]
        """
        if root == None:
            return []
        nodeQueue = [root]
        numberQueue = [1]
        ans = [[root.val]]
        while nodeQueue:
            node = nodeQueue.pop(0)
            number = numberQueue.pop(0)
            if node.left != None:
                nodeQueue.append(node.left)
                numberQueue.append(number+1)
                try:
                    # print(node.left.val)
                    ans[number]+=[node.left.val]
                except:
                    # print(node.left.val)
                    ans.append([node.left.val])
            if node.right != None: 
                nodeQueue.append(node.right)
                numberQueue.append(number+1)
                try:
                    # print(node.right.val)
                    ans[number]+=[node.right.val]
                except:
                    # print(node.right.val)
                    ans.append([node.right.val])
        return ans