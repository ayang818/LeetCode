class Solution {
    public int maxSideLength(int[][] mat, int threshold) {
        int num = 0;
        int c = mat.length;
        int k = mat[0].length;
        if (c < k) {
            int temp = c;
            c = k;
            k = temp; 
        }
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < k; j++) {
                for (int length = num; length <= k; length ++) {
                    if (length <= num) {
                        continue;
                    }
                    // System.out.println("i="+i+"j="+ j+"length="+length+"threshold="+threshold);
                    if (search(i, j, mat, length, threshold)) {
                        num = num > length ? num : length;
                    }
                }
            }
        }
        return num;
    }
    

    // 返回是或不是
    public boolean search(int x, int y, int[][] mat, int length ,int threshold) {
        int res = 0;
        if (x + length > mat.length || y + length > mat[0].length) {
            return false;
        }
        for (int i = x; i <= x+length -1; i++) {
            for (int j = y; j <= y+length -1; j++) {
                res += mat[i][j];
                if (res > threshold) {
                    return false;
                }
            }
        }
        return res <= threshold;
    }
}