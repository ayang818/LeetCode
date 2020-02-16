class Solution {
    public int countNegatives(int[][] grid) {
        int num = 0;
        for (int i = 0; i < grid.length; i++) {
            int tmp = 0;
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] >= 0) {
                    tmp++;
                } else {
                    break;
                }
            }
            num += (grid[0].length - tmp);
        }
        return num;
    }
}