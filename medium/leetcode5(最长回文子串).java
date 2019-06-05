// 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。

// 示例 1：

// 输入: "babad"
// 输出: "bab"
// 注意: "aba" 也是一个有效答案。
// 示例 2：

// 输入: "cbbd"
// 输出: "bb"
class Solution {
    public String longestPalindrome(String s) {
        String ansString = new String("");
        int maxNum = 0, temp = 0 , i,j;
        for (i=1; i < s.length(); i++) {
            for (j=1; (i-j) > 0 && (i+j) < s.length(); j++) {
                if(s.charAt(i-j) != s.charAt(i+j)) {
                    break;
                }    
                temp = j*2+1;
            }
            if (temp > maxNum) {
                maxNum = temp;
                ansString = s.substring(i-j, i-j+maxNum);
                // System.out.println(ansString);
            }
            for (j = 1; (i-j) > 0 && (i+j) < s.length(); j++) {
                if(s.charAt(i-j+1) != s.charAt(i+j)) {
                    break;
                }    
                temp = j*2;                
            }
            if (temp > maxNum) {
                maxNum = temp;
                // System.out.println(i);
                // System.out.println(j);
                // System.out.println(i-j);
                ansString = s.substring(i-j, i-j+maxNum);    
                System.out.println(ansString);
            }
        }
        return ansString.toString();
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        String ansString = s.longestPalindrome("cbbd");
        System.out.println(ansString);
    }
}