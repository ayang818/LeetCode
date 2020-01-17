class Solution {
    public int minFlips(int a, int b, int c) {
        int num = 0;
        while (true) {
            int tempA = a & 1;
            int tempB = b & 1;
            int tempC = c & 1;
            // System.out.println(tempA+" "+tempB+" "+ tempC);
            if (tempC == 0) {
                if (tempA == 1) {
                    num++;
                }
                if (tempB == 1) {
                    num++;
                }
            }
            if (tempC == 1 && tempA == 0 && tempB == 0) {
                num++;
            }
            a = (a >> 1);
            b = (b >> 1);
            c = (c >> 1);
            // System.out.println(a + " "+ b + " "+ c);
            if (a <= 0 && b <= 0 && c <= 0) {
                break;
            }
        }
        return num;
    }
}