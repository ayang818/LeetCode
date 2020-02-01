class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int[][] res = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = A[0].length-1; j >= 0; j--) {
                int columnId = A[0].length - j - 1;
                if (A[i][j] == 0) {
                    res[i][columnId] = 1;
                }
            }
        }
        return res;
    }
}