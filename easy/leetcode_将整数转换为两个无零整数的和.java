class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] list = new int[2];
        for (int i = 0; i <= (n / 2); i++) {
            if (!contains(i, n - i)) {
                list[0] = i;
                list[1] = n - i;
                break;
            }
        }
        return list;
    }

    public boolean contains(int a, int b) {
        String stringa = String.valueOf(a);
        String stringb = String.valueOf(b);
        return stringa.contains("0") || stringb.contains("0");
    }
}