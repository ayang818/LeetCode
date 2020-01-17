class Solution {
    public String freqAlphabets(String s) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char tempChar = s.charAt(i);
            if (tempChar != '#') {
                stack.push(Integer.valueOf(String.valueOf(tempChar)));
            } else {
                Integer temp2 = stack.pop();
                Integer temp1 = stack.pop();
                stack.push(temp1 * 10 + temp2);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Integer entry : stack) {
            sb.append((char) (entry + 96));
        }
        return sb.toString();
    }
}