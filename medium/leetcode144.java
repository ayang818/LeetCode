import java.util.ArrayList;

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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> ansList = new ArrayList<>();
        if (root != null) {
            ansList.add(root.val);
            ansList.addAll(preorderTraversal(root.left));
            ansList.addAll(preorderTraversal(root.right));
        }
        return ansList;
    }
}