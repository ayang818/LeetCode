// 类似桶排序的思路
// https://www.acwing.com/problem/content/1325/

import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            int[] tmp = new int[1001];
            while (num > 0) {
                tmp[scanner.nextInt()] = 1;
                num--;
            }
            for (int i = 0; i < 1001; i++) {
                if (tmp[i] == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}