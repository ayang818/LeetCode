class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        if (m == 0 && n != 0) return n;
        if (m != 0 && n == 0) return m;

        // 准备dp矩阵
        int[][] martix = new int[m+1][n+1];
        for (int i = 0; i <= m; i++) {
            martix[i][0] = i; 
        } 
        for (int i = 0; i <= n; i++) {
            martix[0][i] = i;
        }
        
        for (int i = 1; i <= m; i++) {
            char tempChar1 = word1.charAt(i-1);
            int cost = 0;
            for (int j = 1; j <= n; j++) {
                char tempChar2 = word2.charAt(j-1);
                if (tempChar1 == tempChar2) {
                    cost = 0;
                } else {
                    cost = 1;
                }
                int  valueAbove = martix[i-1][j] + 1;
                int  valueLeft = martix[i][j-1] + 1;
                int  valueDiag = martix[i - 1][j - 1] + cost;
                
                int cellValue = valueAbove < valueLeft ? (valueDiag < valueAbove ? valueDiag : valueAbove) : (valueDiag < valueLeft ? valueDiag : valueLeft);
                martix[i][j] = cellValue;
            }
        }
        int distance = martix[m][n];

        return distance;
    }
}