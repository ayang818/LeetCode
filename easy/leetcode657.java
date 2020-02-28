class Solution {
    public boolean judgeCircle(String moves) {
        int row = 0;
        int col = 0;
        for (char xhar : moves.toCharArray()) {
            if (xhar == 'U') {
                row++;
            }
            if (xhar == 'D') {
                row--;
            }
            if (xhar == 'L') {
                col--;
            }
            if (xhar == 'R') {
                col++;
            }
        }
        return row == 0 && col == 0;
    }
}