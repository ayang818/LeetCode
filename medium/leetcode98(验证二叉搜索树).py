# Definition for a binary tree node.
class TreeNode(object):
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution(object):
    def isValidBST(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        ansList = self.helper(root)
        for i in range(len(ansList)-1):
            if (ansList[i] >= ansList[i+1]):
                return False
        return True

    def helper(self, root):
        if root == None:
            return []
        else:
            return self.helper(root.left) + [root.val] + self.helper(root.right)