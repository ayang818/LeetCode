import java.util.Arrays;
import java.util.Stack;

class Solution {
    public int longestWPI(int[] hours) {
        if (hours.length == 0) {
            return 0;
        }
        int[] prefix = new int[hours.length + 1];
        for (int i = 1; i <= hours.length; i++) {
            prefix[i] += prefix[i - 1] + (hours[i - 1] > 8 ? 1 : -1);
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < prefix.length; i++) {
            if (stack.isEmpty() || prefix[stack.peek()] >= prefix[i]) {
                stack.push(i);
            }
        }
        int  max = 0;
        for (int i = prefix.length-1; i>=0; i--) {
            while (!stack.isEmpty() &&  prefix[i] - prefix[stack.peek()] > 0) {
                Integer start = stack.pop();
                max = Math.max(max, i - start);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // similar to 1 1 -1 -1 -1 -1 1
        int[] a = {9};
        System.out.println(new Solution().longestWPI(a));
    }
}