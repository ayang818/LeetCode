class Solution {
    public String convert(String s, int numRows) {
        if (s == "" || numRows < 1) return "";
        if (numRows == 1) return s;
        int actualRows = Math.min(numRows, s.length());
        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < actualRows; i++) {
            rows.add(new StringBuilder());
        }
        int currentRow = 0;
        boolean isDown = true;
        for (int i = 0; i < s.length(); i++) {
            rows.get(currentRow).append(s.charAt(i));
            if (currentRow == 0) isDown = true;
            if (currentRow == actualRows - 1) isDown = false;
            currentRow += (isDown ? 1 : -1);
        }
        StringBuilder res = new StringBuilder();
        rows.forEach(row -> {
            res.append(row.toString());
        });
        return res.toString();
    }
}