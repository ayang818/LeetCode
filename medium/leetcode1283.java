class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int right = 1000000;
        int mid = 1;
        while (left <= right) {
            mid = left + ((right -left) / 2);
            int res = calc(nums,mid);
            if (res <= threshold) {
                right = mid - 1;
            } 
            if (res > threshold) {
                left = mid + 1;
            }
            
        }
        return left;
    }
    
    
    public int calc(int[] nums, int divi) {
        int res = 0;
        for (int i =0; i< nums.length; i++) {
            if (nums[i]%divi == 0) {
                res += nums[i]/divi;
            } else {
                res += (nums[i]/divi + 1);
            }
        }
        return res;
    }
}