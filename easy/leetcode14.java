class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || (strs.length == 1 && Objects.equals(strs[0], ""))) {
            return "";
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            if (strs[0].length() <= i) {
                break;
            }
            res.append(strs[0].charAt(i));
            for (int j = 0; j < strs.length; j++) {
                String tempString = strs[j];
                if (tempString.length() < i+1) {
                    return res.delete(i, i+1).toString();
                }
                if (!tempString.substring(0, i+1).equals(res.toString())) {
                    return res.delete(i, i+1).toString();
                }
            }
        }
        return res.toString();
    }
}