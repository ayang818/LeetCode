class Solution {
    int[][] dp;
    public int maxStudents(char[][] seats) {
        // dp[i][bits]表示前i行中，状态为bits的最大答案
        // bits 00100100 0表示没人坐，1表示有人坐
        dp = new int[10][1 << 8];
        for (int i = 0;i<seats.length;i++) {
            for (int j = 0 ; j < (1<<8); j++) {
                dp[i][j] = -1;
            }
        }
        // 初始化状态
        dp[0][0] = 0;
        int m = seats[0].length;
        int lim = (1<<m);
        for (int i = 1; i <= seats.length; i++) {
            for (int cur = 0; cur < lim; cur++) {
                for (int pre = 0; pre < lim; pre++) {
                    if (dp[i-1][pre] == -1) continue;
                    boolean flag =true;
                    for (int j = 0; j < m; j++) {
                        // 该位置没人做
                        if (((cur>>j)&1)==0) continue;
                        if (seats[i-1][j] == '#') flag = false;
                        if (j >= 1 && ((cur>>(j-1)) & 1) == 1) flag = false;
                        if (j < m - 1 && (cur>>(j+1))== 1) flag = false;
                        if (j >= 1 && (pre>>(j-1) & 1) == 1) flag = false;
                        if (j < m-1 && (pre>>(j+1)&1) == 1) flag = false;
                    }
                    if (flag == false) continue;
                    dp[i][cur]= Math.max(dp[i][cur], dp[i-1][pre]+bcount(cur));
                }
            }
        }
        int res = -1;
        for (int i = 0; i < lim; i++) {
            res = Math.max(res, dp[seats.length][i]);
        } 
        return res;
    }

    public int bcount(int i) {
        int res = 0;
        while (i>0) {
            if ((i & 1) == 1) res+=1;
            i=(i>>1);
        }
        return res;
    }
}