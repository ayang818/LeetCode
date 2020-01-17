class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int mina = 40001;
        int minb = 40001;
        for (int i = 0; i < ops.length; i++) {
            if (ops[i][0] < mina) {
                mina = ops[i][0];
            }
            if (ops[i][1] < minb) {
                minb = ops[i][1];
            }
        }
        return mina * minb > m * n ? m * n : mina * minb;
    }
}