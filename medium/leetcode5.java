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
        int maxNum = 1, temp = 1, i, j;
        // s为空情况
        if (s.length() == 0) {
            return "";
        }
        // 设置初始值
        String ansString = s.substring(0, 1);
        int length = s.length();
        for (i = 0; i < length; i++) {
            // 按奇数长度拓展
            for (j = 0; (i - j) > 0 && (i + j + 1) < length; j++) {
                if (s.charAt(i - j - 1) != s.charAt(i + j + 1)) {
                    break;
                }
                // 记录此循环回文长度
                temp = (j + 1) * 2 + 1;
            }
            if (temp > maxNum) {
                maxNum = temp;
                ansString = s.substring(i - j, i - j + maxNum);
            }
            // 按偶数长度拓展
            for (j = 0; (i - j) >= 0 && (i + j + 1) < s.length(); j++) {
                if (s.charAt(i - j) != s.charAt(i + j + 1)) {
                    break;
                }
                temp = j * 2 + 2;
            }
            if (temp > maxNum) {
                // 推导得j需要减一
                j -= 1;
                maxNum = temp;
                ansString = s.substring(i - j, i - j + maxNum);
            }
        }
        return ansString.toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String ansString = s.longestPalindrome("cccc");
        System.out.println(ansString);
    }
}