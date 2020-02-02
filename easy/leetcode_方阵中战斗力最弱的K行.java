class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        Line[] res = new Line[mat.length];
        for (int i = 0; i < mat.length; i++){
            res[i] = new Line(0, i);
            for (int j = 0; j<mat[0].length; j++){
                res[i].fightNum += mat[i][j];
            }
        }
        Arrays.sort(res);
        List<Line> rest = Arrays.asList(res);
        Collections.reverse(rest);
        int[] res1 = new int[k];
        for (int i = 0; i < k; i++) {
            res1[i] = rest.get(i).lineNumber;
        }
        return res1;
    }
}

 class Line implements Comparable<Line> {
    public Integer fightNum;
    public Integer lineNumber;

    public Line(Integer fightNum, Integer lineNumber) {
        this.fightNum = fightNum;
        this.lineNumber = lineNumber;
    }

    @Override
    public int compareTo(Line line) {
        if (line.fightNum > this.fightNum) {
            return 1;
        }
        if (line.fightNum == this.fightNum) {
            if (line.lineNumber > this.lineNumber) {
                return 1;
            }
            return -1;
        }
        return -1;
    }
}