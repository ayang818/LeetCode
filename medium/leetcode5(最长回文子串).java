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
        int maxNum = 1, temp = 1, i,j;
        boolean flag = false;
        if (s.length() == 0) {
            return "";
        }
        if (s.length() == 1) {
            return s;
        }
        String ansString = s.substring(0,1);
        for (i=0; i<s.length(); i++) {
            for (j=0; (i-j) > 0 && (i+j+1) < s.length(); j++) {
                if(s.charAt(i-j-1) != s.charAt(i+j+1)) {
                    flag = true;
                    break;
                }    
                temp = (j+1)*2+1;
            }
            if (temp > maxNum && i != 0) {
                j-=1;
                maxNum = temp;
                ansString = s.substring(i-j-1, i-j-1+maxNum);
            }
            flag = false;
            for (j = 0; (i-j) >= 0 && (i+j+1) < s.length(); j++) {
                if(s.charAt(i-j) != s.charAt(i+j+1)) {
                    flag = true;
                    break;
                }           
                temp = j*2+2;                
            }
            if (temp > maxNum) {
                j-=1;
                maxNum = temp;
                ansString = s.substring(i-j, i-j+maxNum);  
            }
            flag = false;
        }
        return ansString.toString();
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        String ansString = s.longestPalindrome("aabba");
        System.out.println(ansString);
    }
}