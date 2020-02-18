class Solution {
    public String longestPalindrome(String s) {
        int[][] dp = new int[s.length()][s.length()];
        if (s.length() == 0) return "";
        int max = 0;
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (i+1 < s.length() && s.charAt(i) == s.charAt(i+1)) {
                dp[i][i+1] = 1;
                max = Math.max(max, 2);
                res = s.substring(i, i+2);
            }
            dp[i][i] = 1;
            if (max < 1) {
                res = String.valueOf(s.charAt(i));
                max = 1;
            }
        }
        for (int i = 0; i < s.length() ; i++) {
            for (int j = 0; j <= i; j++) {
                if (i-1 >= 0 && j+1 <= s.length()-1 && dp[j+1][i-1] == 1 && s.charAt(i) == s.charAt(j)) {
                    
                    dp[j][i] = 1;
                    if (Math.abs(i-j)+1 > max) {
                        max = Math.abs(i-j)+1;
                        res = s.substring(j, i+1);
                    }
                }
            }
        }
        return res;
    }
}
