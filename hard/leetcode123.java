class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (len < 2) return 0;
        int[][][] dp = new int[len+1][3][2];
        for (int i =0; i <= len; i++) {
            for (int j = 0; j <= 2; j ++) {
                for (int k = 0; k < 2; k++) {
                    dp[i][j][k] = -100000;
                }
            }
        }
        dp[0][2][0] = 0;
        for (int i = 1; i <= len; i++) {
            dp[i][2][0] = 0;
            dp[i][0][0] = Math.max(dp[i-1][0][0], dp[i-1][0][1] + prices[i-1]); 
            dp[i][0][1] = Math.max(dp[i-1][0][1], dp[i-1][1][0] - prices[i-1]);
            dp[i][1][0] = Math.max(dp[i-1][1][0], dp[i-1][1][1] + prices[i-1]);
            dp[i][1][1] = Math.max(dp[i-1][1][1], dp[i-1][2][0] - prices[i-1]);
        }
        int max = -10000;
        for (int i = 0; i < dp[len].length; i++) {
            for (int j = 0; j< 2;j++) {
                max = Math.max(max, dp[len][i][j]);
            }
        }
        return max < 0 ? 0 : max;
    }
}