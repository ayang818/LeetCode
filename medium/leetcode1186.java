class Solution {
    public int maximumSum(int[] arr) {
        int[][] dp = new int[arr.length][2];
        int[] sum = new int[arr.length];
        int max = -30000;
        sum[0] = arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
            if (i == 0) {
                dp[i][0] = sum[0];
                dp[i][1] = arr[0]; 
            } else {
                sum[i] = sum[i-1] >= 0 ? sum[i-1]+arr[i] : arr[i];
                dp[i][0] = sum[i];
                dp[i][1] = Math.max(dp[i-1][0], dp[i-1][1]+arr[i]);
            }
        }
        int res = -30000;
        for (int i = 0; i < dp.length; i++) {
            res = Math.max(dp[i][0], res);
            res = Math.max(dp[i][1], res);
        }
        return res == -30000 ? max : res;
    }
}