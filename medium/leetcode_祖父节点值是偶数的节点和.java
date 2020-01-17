/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int sum = 0;

    public int sumEvenGrandparent(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if ((root.val & 1) == 0) {
            calc(root.left, 1);
            calc(root.right, 1);
        } else {
            calc(root.left, -1);
            calc(root.right, -1);
        }
        return sum;
    }

    public void calc(TreeNode node, int depth) {
        if (node == null) {
            return;
        }
        if (node.left != null) {
            if (depth == 1) {
                sum += node.left.val;
            }
            if ((node.val & 1) == 0) {
                calc(node.left, 1);
            } else {
                calc(node.left, -1);
            }
        }
        if (node.right != null) {
            if (depth == 1) {
                sum += node.right.val;
            }
            if ((node.val & 1) == 0) {
                calc(node.right, 1);
            } else {
                calc(node.right, -1);
            }
        }
    }
}