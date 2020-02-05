class Solution {
    public int flipgame(int[] fronts, int[] backs) {
        int[] set = new int[2005];
        for (int i = 0; i < fronts.length; i++){
            if (fronts[i] == backs[i]) {
                set[fronts[i]] = 1;
            }
        }
        Integer min = Integer.MAX_VALUE;
        for (int i = 0; i < fronts.length ;i++) {
            if (set[fronts[i]] == 0) {
                min = Math.min(min, fronts[i]);
            }
            if (set[backs[i]] == 0) {
                min = Math.min(min, backs[i]);
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}