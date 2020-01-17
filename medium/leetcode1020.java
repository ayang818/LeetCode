class Solution {
    int[] direct = new int[]{1, 0, -1, 0, 0, 1, 0, -1};
    int[][] m;

    public int numEnclaves(int[][] A) {
        m = A;
        int c = m.length;
        int k = m[0].length;
        for (int i = 0; i < c; i++) {
            if (m[i][0] == 1) {
                dfs(i, 0);
            }
            if (m[i][k - 1] == 1) {
                dfs(i, k - 1);
            }
        }

        for (int i = 0; i < k; i++) {
            if (m[0][i] == 1) {
                dfs(0, i);
            }
            if (m[c - 1][i] == 1) {
                dfs(c - 1, i);
            }
        }

        int count = 0;
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < k; j++) {
                if (A[i][j] == 1) {
                    count++;
                }
            }
        }
        return count;
    }

    public void dfs(int x, int y) {
        if (m[x][y] == 1) {
            m[x][y] = 0;
            int c = m.length;
            int l = m[0].length;
            for (int i = 0; i < 8; i++, i++) {
                int a = direct[i];
                int b = direct[i + 1];
                if ((x + a < c && x + a >= 0) && (y + b < l && y + b >= 0)) {
                    dfs(x + a, y + b);
                }
            }
        }
    }
}