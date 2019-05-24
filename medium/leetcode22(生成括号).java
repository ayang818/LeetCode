import java.util.ArrayList;
import java.util.List;

class Solution {
    List<String> ansList = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        helper("", 0, 0, n);
        return ansList;
    }
    
    public void helper(String s, int left, int right, int n){
        if(left == n && right == n){
            ansList.add(s);
            return;
        }

        if(left != n){
            helper(s+"(", left+1, right, n);
        }
        if(right!=n && right<left){
            helper(s+")", left, right+1, n);
        }
    }
}