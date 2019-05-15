class Solution(object):
    def hasPathSum(self, root, sum):
        """
        :type root: TreeNode
        :type sum: int
        :rtype: bool
        """
        if not root:
            return False
        nodeStack = [root]
        # numberStack = [1]
        valueStack = [root.val]
        while nodeStack:
            node = nodeStack.pop()
            # number = numberStack.pop()
            value = valueStack.pop()
            if not node.left and not node.right:
                if value == sum:
                    return True
                else:
                    continue
            if node.left != None:
                nodeStack.append(node.left)
                valueStack.append(node.left.val+value)
            if node.right != None:
                nodeStack.append(node.right)
                valueStack.append(node.right.val+value)
        return False