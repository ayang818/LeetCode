class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int  res = 0;
        Map<Integer, Integer> mapA = new HashMap<>();
        Map<Integer, Integer> mapB = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            for (int j=0; j< B.length; j++) {
                int num = A[i] + B[j];
                if (!mapA.containsKey(num)) {
                    mapA.put(num, 1);
                } else {
                    Integer times = mapA.get(num);
                    mapA.put(num, times+1);
                }
            }
        }
        for (int i = 0; i < C.length; i++) {
            for (int j=0; j< D.length; j++) {
                int num = C[i] + D[j];
                if (!mapB.containsKey(num)) {
                    mapB.put(num, 1);
                } else {
                    Integer times = mapB.get(num);
                    mapB.put(num, times+1);
                }
            }
        }
        for (Map.Entry<Integer, Integer> entry : mapA.entrySet()) {
            if (mapB.containsKey(-entry.getKey())) {
                res += (entry.getValue() * mapB.get(-entry.getKey()));
            }
        }
        return res;
    }
}