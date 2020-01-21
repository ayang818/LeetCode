class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) return true;
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char xhar = s.charAt(i);
            if ( (xhar >= '0' && xhar <= '9') || (xhar>= 'a' && xhar <= 'z')){
                sb.append(xhar);
            }
        }
        return sb.toString().equals(sb.reverse().toString());
    }
}