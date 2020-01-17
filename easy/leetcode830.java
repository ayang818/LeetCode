class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> res = new ArrayList<>();
        int start = 0;
        int end = 0;
        for (int i =0 ;i < S.length(); i++) {
            char xhar = S.charAt(i);
            if (i+1 < S.length() && xhar == S.charAt(i+1)) {
                end++;
            } else {
                if ((end - start) >= 2) {
                    res.add(Arrays.asList(start, end));
                }
                start = i+1;
                end = i+1;
            }
        }
        return res;
    }
}