class Solution {
    public int[] sumZero(int n) {
        int[] nums = new int[n];
        int num = 1;
        int length = n;
        if ((n & 1) == 1) length--; 
        for (int i = 0; i < length; i++,i++,num++) {
            nums[i] = num;
            nums[i+1] = -num;
        }
        return nums;
    }
}