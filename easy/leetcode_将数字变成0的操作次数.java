class Solution {
    public int numberOfSteps (int num) {
        int times = 0;
        if (num == 0) return 0;
        while (num != 0) {
            if ((num & 1) == 1) {
                num-=1;
                times++;
            } else {
                num/=2;
                times++;
            }
        }
        return times;
    }
}