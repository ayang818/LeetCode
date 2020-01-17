class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        if (A.length < 3) {
            return 0;
        }
        int res = 0;
        List<Integer> list = new ArrayList<>();
        int delta = A[1] - A[0];
        list.add(A[0]);
        list.add(A[1]);
        for (int i = 2; i < A.length; i++) {
            int tempDelta = A[i] - A[i - 1];
            if (delta == tempDelta) {
                delta = tempDelta;
                list.add(A[i]);
                // System.out.println("start1"+list.toString());
            }
            if (i == A.length - 1 || delta != tempDelta) {
                // System.out.println("start"+list.toString());
                delta = tempDelta;
                if (list.size() >= 3) {
                    res += len(list.size());
                }
                list.clear();
                list.add(A[i - 1]);
                list.add(A[i]);
                // System.out.println("end"+list.toString());
            }
        }
        return res;
    }

    public int len(int size) {
        return size != 0 ? ((size - 1) * (size - 2)) / 2 : 0;
    }
}