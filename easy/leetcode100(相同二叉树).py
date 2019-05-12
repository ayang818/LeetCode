#Java递归代码实现
# /**
#  * Definition for a binary tree node.
#  * public class TreeNode {
#  *     int val;
#  *     TreeNode left;
#  *     TreeNode right;
#  *     TreeNode(int x) { val = x; }
#  * }
#  */
# class Solution {
#     public boolean isSameTree(TreeNode p, TreeNode q) {
#         return check(p, q);
#     }
#     public boolean check(TreeNode p, TreeNode q){
#         if (p == null && q==null) return true;
#         if(p==null || q==null) return false;
#         if (p.val != q.val) return false;
#         return check( p.left,  q.left) && check(p.right, q.right);
#     }

# }
#python代码非递归实现
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def isSameTree(self, p, q):
        """
        :type p: TreeNode
        :type q: TreeNode
        :rtype: bool
        """
        nodequeue= []
        nodequeue.append(p)
        nodequeue.append(q)
        while (nodequeue):
            next1 = nodequeue.pop(0)
            next2 = nodequeue.pop(0)            
            if not next1  and not next2:
                continue
            if not next1 or not next2:
                return False
            if next1.val != next2.val:
                return False
            nodequeue.append(next1.left)
            nodequeue.append(next2.left)            
            nodequeue.append(next1.right)            
            nodequeue.append(next2.right)
        return True
