class Solution {
    public boolean isPowerOfThree(int n) {
        long ans = 1;
        while(ans <= n)
        {
            if (ans != n) ans*=3;
            else return true;
        }
        return false;
    }
}
