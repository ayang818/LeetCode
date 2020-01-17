import java.lang.Math;

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        stack.push(root);
        stack2.push(1);
        int depth = 0;
        while (!stack.isEmpty()) {
            //上一层有几个节点，stack2就会有几个相同的数，每次经过一个节点，循环都会弹出一个数，这样就实现了节点之间的层数统一。
            TreeNode node = stack.pop();
            int ord = stack2.pop();
            depth = java.lang.Math.max(ord, depth);
            if (node.left != null) {
                stack.push(node.left);
                stack2.push(ord + 1);
            }
            if (node.right != null) {
                stack.push(node.right);
                stack2.push(ord + 1);
            }
        }
        return depth;
    }
}