class Solution {
    Map<TreeNode, Integer> deepthCache = new HashMap<>();

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        int left = deepth(root.left);
        int right = deepth(root.right);
        if (left > right) return lcaDeepestLeaves(root.left);
        if (left < right) return lcaDeepestLeaves(root.right);
        return root;
    }

    public int deepth(TreeNode root) {
        if (root == null) return 0;
        return deepthCache.computeIfAbsent(root, k -> Math.max(deepth(root.left), deepth(root.right)) + 1);
    }
}