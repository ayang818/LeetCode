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
    String res = "-";
    public String smallestFromLeaf(TreeNode root) {
        dfs(root, "");
        return res == "-" ? "" : res;
    }

    public void dfs(TreeNode node, String route) {
        if (node == null) {
            return ;
        }
        route+=((char) (97+node.val));
        if (node.left == null && node.right == null) {
            check(route);
            return;
        }
        if(node.left != null) dfs(node.left, route);
        if(node.right != null) dfs(node.right, route);
    }

    public void check(String route) {
        StringBuilder sb = new StringBuilder();
        for (int i = route.length()-1; i >= 0; i--) sb.append(route.charAt(i));
        if (res == "-") {
            res = sb.toString();
            return;
        }
        String tmp = sb.toString();
        for (int i = 0; i<Math.min(tmp.length(), res.length()); i++) {
            if (tmp.charAt(i) < res.charAt(i)) {
                res = tmp;
            } else if (tmp.charAt(i) > res.charAt(i)) {
                return;
            }
        }
        res = tmp.length() > res.length() ? res : tmp;
    }
}