// 这题给的启发就是可以使用一对数组来维护方向，使用for循环来遍历状态可能性。
// https://www.acwing.com/problem/content/1326/

import java.lang.*;
import java.util.*;

public class Main {
    static int[][] g = new int[16][16];
    static int[] dx = {1, 1, 1, 0};
    static int[] dy = {-1, 0, 1, 1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            int success = 0, state = 0;
            for (int i = 1; i <= num; i++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                if (success != 0) continue;
                // A black 1, B 2;
                if ((i & 1) == 1) g[x][y] = 1;
                else g[x][y] = 2;
                for (int j = 0; j < 4; j++) {
                    int l = 0, r = 0;
                    while (true) {
                        int a = x + dx[j] * (l + 1), b = y + dy[j] * (l + 1);
                        if (a < 1 || a > 15 || b < 1 || b > 15) break;
                        if (g[x][y] != g[a][b]) break;
                        l++;
                    }
                    while (true) {
                        int a = x - dx[j] * (r + 1), b = y - dy[j] * (r + 1);
                        if (a < 1 || a > 15 || b < 1 || b > 15) break;
                        if (g[x][y] != g[a][b]) break;
                        r++;
                    }
                    if (l + r + 1 >= 5) {
                        success = g[x][y];
                        state = i;
                        break;
                    }
                }
            }
            if (success == 0) {
                System.out.println("Tie");
            } else if (success == 1) {
                System.out.println("A" + " " + state);
            } else {
                System.out.println("B" + " " + state);
            }
        }
    }
}