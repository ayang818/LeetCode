class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = left(nums, target);
        result[1] = right(nums, target);
        return result;
    }

    public int left(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        if (right == 0) {
            return -1;
        }
        int mid = -1;
        // 先算左边界
        while (left < right) {
            mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid;
            } else if (nums[mid] == target) {
                right = mid;
            }
        }
        return left < nums.length && nums[left] == target ? left : -1;
    }

    public int right(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        if (right == 0) {
            return -1;
        }
        int mid = -1;
        while (left < right) {
            mid = (left + right) / 2;
            if (nums[mid] == target) {
                left = mid + 1; // 注意
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid;
            }
        }
        return left - 1 >= 0 && left - 1 < nums.length && nums[left - 1] == target ? left - 1 : -1;
    }
}