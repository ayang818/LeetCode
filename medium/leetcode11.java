class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int res = 0;
        int temp = (Math.min(height[left], height[right])) * Math.abs(left - right);
        res = temp > res ? temp : res;
        while (left < right) {
            if (height[left] < height[right]) {
                left ++;
            } else if (height[left] > height[right]) {
                right --;
            } else {
                left ++;
                right --;
            }
            temp = (Math.min(height[left], height[right])) * Math.abs(left - right);
            res = temp > res ? temp : res; 
        }
        return res;
    }
}