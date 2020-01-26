class Solution {
    public int removePalindromeSub(String s) {
        if (s.length() == 0) {
            return 0;
        }
        StringBuilder sb1 = new StringBuilder(s);
        if (sb1.toString().equals(sb1.reverse().toString())) {
            return 1;
        }
        return 2;
    }
}