class Solution {
    public int candy(int[] ratings) {
        int[] res = new int[ratings.length];
        Arrays.fill(res, 1);
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i-1]) {
                res[i] = res[i-1]+1;
            } else if (ratings[i] < ratings[i-1] && res[i] >= res[i-1]) {
                check(ratings, res, i);
            }
        }

        int num = 0;
        for(int i = 0; i < res.length; i++) {
            num+=res[i];
        }
        return num;
    }

    public void check(int[] ratings, int[] res, int i) {
        if (i < 1) return;
        if (ratings[i] < ratings[i-1] && res[i] >= res[i-1]) {
            res[i-1] += (res[i] - res[i-1] + 1);
            check(ratings, res, i-1);
        } else {
            return;
        }
    }
}