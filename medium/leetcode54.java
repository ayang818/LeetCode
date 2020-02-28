class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return new ArrayList<>();
        int row = 0, col = 0;
        int maxRow = matrix.length-1;
        int maxCol = matrix[0].length-1;
        int[] states = {0,1,2,3};
        int state = 0;
        int unreach = -10000;
        int[] res = new int[(maxRow+1) * (maxCol+1)];
        int times = 0;
        int i ;
        for (i=0 ;i < res.length; ) {
            if (times >= 5) {
                res[i] = matrix[row][col];
                break;
            }
            if (state == 0 && col+1 <= maxCol && matrix[row][col+1] != unreach) {
                res[i] = matrix[row][col];
                matrix[row][col] = unreach;
                col++;
                i++;times=0;
                continue;
            } else if (state == 0 && (col+1 > maxCol || matrix[row][col+1] == unreach)) {
                state = 1;
                times++;
                continue;
            }
            if (state == 1 && row+1 <= maxRow && matrix[row+1][col] != unreach) {
                res[i] = matrix[row][col];
                matrix[row][col] = unreach;
                row++;
                i++;times=0;
                continue;
            } else if (state == 1 && (row+1 > maxRow || matrix[row+1][col] == unreach)) {
                state = 2;
                times++;
                continue;
            }
            if (state == 2 && col -1 >= 0 && matrix[row][col-1] != unreach) {
                res[i] = matrix[row][col];
                matrix[row][col] = unreach;
                col--;
                i++;times=0;
                continue;
            } else if (state == 2 && (col -1 < 0 || matrix[row][col-1] == unreach)) {
                state = 3;
                times++;
                continue;
            }
            if (state == 3 && row-1 >= 0 && matrix[row-1][col] != unreach) {
                res[i] = matrix[row][col];
                matrix[row][col] = unreach;
                row--;
                i++;times=0;
                continue;
            } else if (state == 3 && (row-1 < 0 || matrix[row-1][col] == unreach)) {
                state = 0;
                times++;
                continue;
            }
        }
        List<Integer> tmp = new ArrayList<>();
        for (int k = 0; k < res.length; k++) {
            tmp.add(res[k]);
        }
        return tmp;     
    }
}