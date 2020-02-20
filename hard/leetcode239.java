import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0 || nums.length < k) {
            return new int[]{};
        }
        Comparator<Integer> cmp = (a, b) -> b-a;
        PriorityQueue<Integer> queue = new PriorityQueue(cmp);
        int left = 0;
        int right = k-1;
        int[] res = new int[nums.length - k + 1];
        int idx = 0;
        for (int i = 0; right < nums.length; i++) {
            queue.offer(nums[i]);
            if (i < right) {
                continue;
            }
            res[idx++] = queue.peek();
            queue.remove(nums[left++]);
            right++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] test = {1, 3, -1, -3, 5, 3, 6, 7};
        new Solution().maxSlidingWindow(test, 3);
    }
}