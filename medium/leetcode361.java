class Solution {
    public int maxKilledEnemies(char[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) return 0; 
        int[][] res = new int[grid.length][grid[0].length];
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            int pre = 0;
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 'W') pre = 0;
                else if (grid[i][j] == 'E') pre+=1;
                res[i][j] += pre;
            }
            pre= 0;
            for (int j = grid[i].length-1; j>=0; j-- ) {
                if (grid[i][j] == 'W') pre = 0;
                else if (grid[i][j] == 'E') pre+=1;
                res[i][j] += pre;
            }
        }

        for (int i = 0; i < grid[0].length; i++) {
            int pre = 0;
            for (int j = 0; j < grid.length; j++) {
                if (grid[j][i] == 'W') pre = 0;
                else if (grid[j][i] == 'E') pre+=1;
                res[j][i] += pre;
            }

            pre = 0;
            for (int j = grid.length-1; j >= 0; j--) {
                if (grid[j][i] == 'W') pre = 0;
                else if (grid[j][i] == 'E') pre+=1;
                res[j][i] += pre;
            }
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 'W' || grid[i][j] == 'E') continue;
                ans = Math.max(res[i][j], ans);
            }
        }
        return ans;
    }
}