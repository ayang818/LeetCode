class Solution {
    public int trap(int[] height) {
        if (height.length == 0) {
            return 0;
        }
        int[] leftMAX = new int[height.length];
        int[] rightMAX = new int[height.length];
        leftMAX[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMAX[i] = Math.max(height[i], leftMAX[i-1]);
        }
        rightMAX[height.length-1] = height[height.length-1];
        for (int i = height.length-2; i >= 0; i--) {
            rightMAX[i] = Math.max(rightMAX[i+1],height[i]);
        }
        int res = 0;
        for (int i = 0; i < height.length; i++) {
            int left = leftMAX[i];
            int right = rightMAX[i];
            res += Math.min(left, right) - height[i];
        }
        return res;
    }
}