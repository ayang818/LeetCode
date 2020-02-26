class Solution {
    public int[][] transpose(int[][] A) {
        int row = A[0].length;
        int col = A.length;
        int[][] res = new int[row][col];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                res[j][i] = A[i][j];
            }
        }
        return res;
    }
}