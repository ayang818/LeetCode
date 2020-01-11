class Solution {
    public int[][] matrixBlockSum(int[][] mat, int K) {
        int[][] res = new int[mat.length][mat[0].length];
        int length = K;
        for (int i = 0; i< mat.length; i++) {
            for(int j = 0; j<mat[0].length; j++) {
                int top = i - K >= 0 ? i - K : 0;
                int bottom = i + K < mat.length ? i+K : mat.length-1;
                int left =  j - K >= 0 ? j - K : 0;
                int right = j + K < mat[0].length ? j+K : (mat[0].length-1);
                int sum = 0;
                for (int start_i = top; start_i <= bottom; start_i++) {
                    for (int start_j = left; start_j <= right; start_j++) {
                        // System.out.println(start_i+""+start_j);
                        sum += mat[start_i][start_j];
                    }
                }
                res[i][j] = sum;
            }
        }
        return res;
    }
}