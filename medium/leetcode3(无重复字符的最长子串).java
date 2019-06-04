import java.util.ArrayList;
import java.util.HashMap;


public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int  ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int leftWindow=0,rightWindow = 0;
        for (; rightWindow < s.length(); rightWindow++) {
            if (map.containsKey(s.charAt(rightWindow))){
                leftWindow = Math.max(leftWindow, map.get(s.charAt(rightWindow))+1);
            } 
            map.put(s.charAt(rightWindow), rightWindow);
            ans = Math.max(ans, rightWindow-leftWindow+1); 
        }
        return ans;
    }
}