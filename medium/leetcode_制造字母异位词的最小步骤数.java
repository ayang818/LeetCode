class Solution {
    public int minSteps(String s, String t) {
        char[] sChar = new char[128];
        char[] tChar = new char[128];
        for (char xhar : s.toCharArray()) {
            sChar[xhar]+=1;
        }
        for (char xhar : t.toCharArray()) {
            tChar[xhar]+=1;
        }
        int res = 0;
        for (int i = 'a'; i <= 'z'; i++) {
            res += Math.abs(sChar[i]-tChar[i]);
        }
        return res/2;
    }
}