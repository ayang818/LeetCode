class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res = new ArrayList<>();
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9 - i + 1; j++) {
                int num = 0;
                int temp = j;
                for (int k = 0; k < i; k++) {
                    num = num * 10 + temp;
                    temp++;
                }
                if (num <= high && num >= low) {
                    res.add(num);
                }
            }
        }
        Collections.sort(res);
        return res;
    }
}