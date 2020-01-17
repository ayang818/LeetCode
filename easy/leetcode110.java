class Solution {
    int height = 0;

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left != null) {
            dfs(root.left, 1);
        }
        int leftHeight = height;
        height = 0;
        if (root.right != null) {
            dfs(root.right, 1);
        }
        int rightHeight = height;
        height = 0;
        return Math.abs(rightHeight - leftHeight) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    public void dfs(TreeNode root, Integer depth) {
        if (root == null) return;
        if (root.left != null) {
            dfs(root.left, depth + 1);
        }
        if (root.right != null) {
            dfs(root.right, depth + 1);
        }
        if (root.left == null && root.right == null) {
            // System.out.println(depth);
            height = height < depth ? depth : height;
        }
    }
}