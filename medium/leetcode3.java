class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        StringBuilder currentStringBuilder = new StringBuilder();
        String currentString;
        char[] charList = s.toCharArray();
        for (int i = 0; i < charList.length; i++) {
            char currentChar = charList[i];
            currentString = currentStringBuilder.toString();
            char[] charList1 = currentString.toCharArray();
            for (int j = 0; j < charList1.length; j++) {
                char innerChar = charList1[j];
                // 假设当前字符串在取出字符串中
                if (innerChar == currentChar) {
                    currentStringBuilder.delete(0, j + 1);
                    break;
                }
            }
            currentStringBuilder.append(currentChar);
            int length = currentStringBuilder.toString().length();
            if (length > maxLength) {
                maxLength = length;
            }
        }
        return maxLength;
    }
}