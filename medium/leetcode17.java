import java.util.ArrayList;
import java.util.List;

//给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。

// 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母
class Solution {
    //2, 3
    String[] map = new String[]{"", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    List<String> resList = new ArrayList<>();

    public static void main(String[] args) {
        Solution s = new Solution();
        s.letterCombinations("235");
    }

    public List<String> letterCombinations(String digits) {
        if (digits.equals(null) || digits.length() == 0) {
            return resList;
        }
        getCombination(digits, 0, "");
        return resList;
    }

    //这里使用一个递归，实现回溯算法
    //index代表当前递归处理的层数
    public void getCombination(String digits, int index, String string) {
        if (index == digits.length()) {
            resList.add(string);
            return;
        }
        // System.out.println(digits.charAt(index));
        int position = digits.charAt(index) - '1';
        // System.out.println(position);
        //获取这个位置对应字符串
        String str = map[position];
        for (int i = 0; i < str.length(); i++) {
            String tempString = string + str.charAt(i);
            getCombination(digits, index + 1, tempString);
        }
    }
}

