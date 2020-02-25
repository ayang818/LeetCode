import java.util.ArrayList;
import java.util.List;

class Solution {
    static int[] dx = {1, 0, 1, 1};
    static int[] dy = {0, 1, 1, -1};
    List<List<String>> res;

    public static void main(String[] args) {
        new Solution().solveNQueens(4);
    }

    public List<List<String>> solveNQueens(int n) {
        int[][] m = new int[n][n];
        res = new ArrayList<>();
        settleQueen(m, 0);
        return res;
    }

    public boolean settleQueen(int[][] m, int x) {
        if (x == m.length) {
            List<String> tmp = new ArrayList<>();
            for (int[] arr : m) {
                tmp.add(generate(arr));
            }
            res.add(tmp);
            // println(m);
            return false;
        }
        for (int i = 0; i < m.length; i++) {
            for (int y = 0; y < m.length; y++) m[x][y] = 0;
            // if is true, dfs again, else reversion
            if (check(m, x, i)) {
                m[x][i] = 1;
                if (settleQueen(m, x + 1)) {
                    return true;
                }
            }
        }
        for (int y = 0; y < m.length; y++) m[x][y] = 0;
        return false;
    }

    public boolean check(int[][] m, int x, int y) {
        for (int i = 0; i < m.length; i++) {
            if (m[i][y] == 1) return false;
        }
        for (int i = 0; i < m.length; i++) {
            if (m[x][i] == 1) return false;
        }
        for (int i = 0; i < 4; i++) {
            int l = 0, r = 0;
            while (true) {
                int ax = x + (l + 1) * dx[i], ay = y + (l + 1) * dy[i];
                if (ax < 0 || ax > m.length-1 || ay < 0 || ay > m.length-1) break;
                if (m[ax][ay] == 1) return false;
                l++;
            }
            while (true) {
                int ax = x - (r + 1) * dx[i], ay = y - (r + 1) * dy[i];
                if (ax < 0 || ax > m.length-1 || ay < 0 || ay > m.length-1) break;
                if (m[ax][ay] == 1) return false;
                r++;
            }
        }
        return true;
    }

    public String generate(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            if (num == 1) {
                sb.append("Q");
            } else {
                sb.append(".");
            }
        }
        return sb.toString();
    }

    public void println(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            System.out.print("[");
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[i][j]+ " ");
            }
            System.out.println("]");
        }
        System.out.println("---------");
    }
}