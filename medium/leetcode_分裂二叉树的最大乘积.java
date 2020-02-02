/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List<Integer> list = new ArrayList<>(50500);
    public int maxProduct(TreeNode root) {
        if (root == null) {
            return 0;
        }
        long total = compute(root);
        long halfTotal = total >> 1;
        long min = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            long delta = Math.abs((total - list.get(i)) - list.get(i));
            if (min > delta) {
                min = delta;
            }
        }
        long x = (total-min) >> 1;
        return (int) (x*(total-x)%(1e9+7));
    }

    public int compute(TreeNode node) {
        if (node == null) return 0;
        int sum = node.val;
        if (node.left == null && node.right == null) {
            list.add(sum);
            return node.val; 
        }
        sum += compute(node.left);
        sum += compute(node.right);
        list.add(sum);
        return sum;
    }
}