// 挺有意思的一题，学了一手闫式dp分析法，首先dp问题其实都是从集合状态的推断得到的，对于这个问题我们选要求n位学生分成k组队列的最小值，那么我们推断有如下的状态表示dp[i][j]表示前i个同学分成k个小组时候的最小值。同时分析这个集合的最后一组也就是第j组，这组队列有多少人，分析得到，dp[i][j] = Math.min(dp[i][j], dp[k-1][j-1] + (arr[i] - arr[k]) * (arr[i] - arr[k]));
// https://www.acwing.com/problem/content/1328/

import java.util.*;
import java.lang.*;

class Main {
    static int[][] dp = new int[510][510];
    static int[] arr = new int[510];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            int groups = scanner.nextInt();
            for (int i = 1; i <= num ; i++) arr[i] = scanner.nextInt();
            Arrays.sort(arr, 1, num+1);
            for (int i = 0; i <dp.length; i++) {
                Arrays.fill(dp[i], 100000);
            }
            if (groups >= num) {
                System.out.println(0);
                continue;
            }
            dp[0][0] = 0;
            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= groups && j <= i; j++) {
                    for (int k = i; k >= j; k--) {
                        dp[i][j] = Math.min(dp[i][j], dp[k-1][j-1] + (arr[i] - arr[k]) * (arr[i] - arr[k]));
                    }
                }
            }
            System.out.println(dp[num][groups]);
        }
    }
}