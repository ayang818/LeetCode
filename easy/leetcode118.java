class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if (numRows == 0) {
            return res;
        }
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        res.add(firstRow);
        if (numRows == 1) {
            return res;
        }
        // 第i行,从第0行开始算
        for (int i = 1; i < numRows; i++) {
            // 列数
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                list.add(get(res.get(i-1), j-1)+get(res.get(i-1), j));
            }
            res.add(list);
        }
        return res;
    }

    public Integer get(List<Integer> list, Integer index) {
        if (index >= 0 && index < list.size()) {
            return list.get(index);
        }
        return 0;
    }
}