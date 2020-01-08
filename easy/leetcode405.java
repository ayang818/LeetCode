class Solution {
    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        int mask = 15;
        StringBuilder sb = new StringBuilder();
        while (sb.length() < 8 && num != 0) {
            int temp = num & mask;
            // System.out.println(temp);
            if (temp >= 0 && temp <= 9) {
                sb.insert(0, (char) (temp + 48));
            } else {
                sb.insert(0, (char) (temp + 87));
            }
            num = num >> 4;
        }
        return sb.toString();
    }
}