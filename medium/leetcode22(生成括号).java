import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

class Solution {
    List<String> res = new ArrayList<String>();
    public static void main(String[] args) {
        Solution s = new Solution();
        List list = s.generateParenthesis(3);
        System.out.println(list);
    }
    public List<String> generateParenthesis(int n) {
        generate("", 0, 0, n);
        return res;
    }
        //count1统计“(”的个数，count2统计“)”的个数
    public void generate(String ans, int count1, int count2, int n){
        
        if(count1 > n || count2 > n) return;
        
        if(count1 == n && count2 == n) {
            res.add(ans);
        }
 
        if(count1 >= count2){
            generate(ans+"(", count1+1, count2, n);
            generate(ans+")", count1, count2+1, n);            
        }
    }
}