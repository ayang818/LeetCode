# DFS
class Solution(object):
    def isSymmetric(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        return self.check(root.left, root.right)


    def check(self, Node1, Node2):
        if Node1 == None and Node2 == None:
            return True
        if Node1 == None or Node2 == None:
            return False
        return Node1.val == Node2.val and self.check(Node1.left, Node2.right) and self.check(Node1.right, Node2.left)
    
'''
or
'''
# BFS
class Solution(object):
    def isSymmetric(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        queue = []
        if not root:
            return True
        queue.append(root.left)
        queue.append(root.right)
        while queue:
            left_node = queue.pop(0)
            right_node = queue.pop(0)
            if not left_node and not right_node:
                continue
            if not left_node or not right_node:
                return False
            if left_node.val != right_node.val:
                return False
            queue.append(left_node.left,)
            queue.append(right_node.right)
            queue.append(left_node.right)
            queue.append(right_node.left)
        return True