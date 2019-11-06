import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int num = scan.nextInt();
            int size = scan.nextInt();
            int[] sizeList = new int[num+1];
            int[] valueList = new int[num+1];
            int[][] dp = new int[num+1][size+1];
            for (int i = 1 ; i <= num ; i++) {
                sizeList[i] = scan.nextInt();
                valueList[i] = scan.nextInt();
            }
            dp[0][0] = 0;
            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= size ; j++) {
                    if (j >= sizeList[i]) {
                        dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-sizeList[i]]+valueList[i]);
                    } else {
                        dp[i][j] = dp[i-1][j];
                    }
                }
            }
            System.out.println(dp[num][size]);
        }
    }
}