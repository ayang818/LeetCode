class Solution {
    public int consecutiveNumbersSum(int N) {
        int res = 0;
        int i = 1;
        while (N > 0) {
            if (N % i == 0) {
                res +=1;
            }
            N-=i;
            i+=1;
        }
        return res;
    }
}