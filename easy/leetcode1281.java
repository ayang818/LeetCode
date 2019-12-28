class Solution {
    public int subtractProductAndSum(int n) {
        int ji = 1;
        int he = 0;
        while (n > 0) {
            int temp = n%10;
            n = n/10;
            ji*=temp;
            he+=temp;
        }
        return ji-he;
    }
}