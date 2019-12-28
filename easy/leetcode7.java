class Solution {
    public int reverse(int x) {
        int tempX = x;
        boolean isPositive = tempX > 0 ? true : false;
        long resNum = 0;
        tempX = Math.abs(tempX);
        while (tempX > 0) {
            resNum = (long) resNum*10 + ((long) tempX%10);
            if (resNum > Integer.MAX_VALUE) return 0;
            tempX /= 10;
        }
        return isPositive ? (int) resNum : (int) -resNum;
    }
}