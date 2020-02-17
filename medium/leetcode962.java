class Solution {
    public int maxWidthRamp(int[] A) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i< A.length; i++) {
            if (stack.isEmpty() || A[stack.peek()] > A[i]) {
                stack.push(i);
            }
        }
        int max = 0;
        for (int i = A.length-1; i>=0; i--) {
            while (!stack.isEmpty() && A[stack.peek()] <= A[i]) {
                int start = stack.pop();
                max = Math.max(max, i - start);
            }
        }
        return max;
    }
}