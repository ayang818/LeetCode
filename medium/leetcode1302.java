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
        public int deepestLeavesSum(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            Queue<Integer> depth = new LinkedList<>();
            int[] vals = new int[10005];
            queue.offer(root);
            depth.offer(1);
            vals[1]+=root.val;
            while (queue.peek() != null) {
                TreeNode node = queue.poll();
                Integer dep = depth.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                    depth.offer(dep+1);
                    vals[dep+1]+=node.left.val;
                }
                if (node.right != null) {
                    queue.offer(node.right);
                    depth.offer(dep+1);
                    vals[dep+1]+=node.right.val;
                }
            }
            for (int i = 5004; i >= 0 ;i--) {
                if (vals[i]!=0) {
                    return vals[i];
                }
            }
            return 0;
        }
    }