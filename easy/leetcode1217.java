class Solution {
    public int minCostToMoveChips(int[] chips) {
        int ji = 0;
        int ou = 0;
        for (int i = 0; i < chips.length; i++) {
            if ((chips[i] & 1) == 1) {
                ji += 1;
            } else {
                ou += 1;
            }
        }
        return ji > ou ? ou : ji;
    }
}