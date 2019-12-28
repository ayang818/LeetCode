class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            System.out.println(left);
            System.out.println(mid);
            System.out.println(right);
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] >= nums[left]) {
                if (nums[left] <= target && nums[mid] >= target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] <= target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] list = {4, 5, 1, 2, 3};
        int localtion = s.search(list, 5);
        System.out.println(localtion);
    }
}
