public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public boolean isValidBST(TreeNode root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public boolean helper(TreeNode root, Long min, Long max) {
        if (root == null) {
            return true;
        } 
        if ((root.val <= min) || (root.val >= max)) {
            return false;
        }
        return helper(root.left, min, (long) root.val) && helper(root.right, (long) root.val, max);
    }
}

