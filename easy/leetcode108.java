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
    int[] list;
    public TreeNode sortedArrayToBST(int[] nums) {
        list = nums;
        if (nums == null || nums.length == 0) {
            return null;
        }
        return build(0, nums.length);
    }
    
    // 根据数组区间构造子树
    public TreeNode build(int left, int right) {
        int index = left + (right - left) / 2;
        TreeNode root = new TreeNode(list[index]);
        if (index - left > 0) {
            root.left = build(left, index);
        }
        if (right - index - 1 > 0) {
            root.right = build(index+1, right);            
        }
        // System.out.println(list[index]);
        return root;
    }
}