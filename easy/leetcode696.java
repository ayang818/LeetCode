class Solution {
    public int countBinarySubstrings(String s) {
        int pre = 0, cur = 1, res = 0;
        int len = s.length();
        for (int i = 1; i < len; i++) {
            if (s.charAt(i) == s.charAt(i-1)) cur++;
            else {
                pre = cur;
                cur = 1;
            }
            if (pre >= cur) res++;
        }
        return res;
    }
}