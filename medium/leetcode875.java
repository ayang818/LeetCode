class Solution {
    public int minEatingSpeed(int[] piles, int H) {
        long speed = binary(piles, H);
        return (int) speed;
    }

    public int calc(int[] piles, long mid) {
        int res = 0;
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] % mid == 0) {
                res += piles[i] / mid;
            } else {
                res += ((piles[i] / mid) + 1);
            }
        }
        return res;
    }

    public long binary(int[] piles, int H) {
        long left = 1;
        long right = 1000000000;
        long mid = left;
        while (left <= right) {
            mid = ((left + right) / 2);
            int res = calc(piles, mid);
            if (res < H) {
                right = mid - 1;
            } else if (res > H) {
                left = mid + 1;
            }
            if (res == H) {
                right = mid - 1;
            }
            // System.out.println(left + "left");
            // System.out.println(mid + "mid");
            // System.out.println(right + "right");
            // System.out.println(res + "res");
        }
        return left;
    }
}