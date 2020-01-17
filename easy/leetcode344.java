class Solution {
    char temp;

    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            int after = s.length - 1 - i;
            temp = s[after];
            s[after] = s[i];
            s[i] = temp;
        }
    }
}