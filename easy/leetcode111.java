import java.util.Stack;

// import javax.swing.tree.TreeNode;

// class Solution {
//     public int minDepth(TreeNode root) {
//         if(root == null)
//             return 0;
//         if(root.left != null && root.right != null)
//             return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
//         else if(root.left != null)
//             return minDepth(root.left) + 1;
//         else if(root.right != null)
//             return minDepth(root.right) + 1;
//         else
//             return 1;
//     }
// }
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//栈实现一次DFS
class Solution {
    public int minDepth(TreeNode root) {
        if(root == null)
        {
            return 0;
        }
        if (root.left == null && root.right == null)
        {
            return 1;
        }
        Stack<TreeNode> nodeStack = new Stack<>();
        Stack<Integer> numberStack = new Stack<>();
        nodeStack.push(root);
        numberStack.push(1);
        int min_depth = 10000;
        while (nodeStack.size() != 0)
        {
            TreeNode node = nodeStack.pop();
            int number = numberStack.pop();
            if (node.left == null && node.right == null)
            {
                min_depth = java.lang.Math.min(min_depth, number);
            }
            if (node.left != null)
            {
                nodeStack.push(node.left);
                numberStack.push(number+1);
                // min_depth = java.lang.Math.min(min_depth, number+1);
            }
            if (node.right != null)
            {
                nodeStack.push(node.right);
                numberStack.push(number+1);
                // min_depth = java.lang.Math.min(min_depth, number+1);
            }
        }
        return min_depth;
    }
}