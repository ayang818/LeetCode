class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        int[][] res = new int[n][m];
        for (int i = 0 ;i < indices.length; i++) {
            int first = indices[i][0];
            int second = indices[i][1];
            for (int j = 0; j < m; j++) {
                res[first][j]+=1;
            }            
            for (int j = 0; j<n; j++) {
                res[j][second]+=1;
            }
        }
        int sum = 0;
        for (int i = 0; i<n;i++) {
            for (int j = 0; j < m; j++) {
                if ((res[i][j] & 1) == 1) {
                    sum ++;
                }
            }
        }
        return sum;
    }
}