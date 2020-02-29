class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        Queue<Integer> queue = new LinkedList();
        List<Integer> list = new ArrayList();
        for (int i = 0; i < A.length; i++) {
            if (A[i].length == 0) continue;
            queue.offer(A[i][0]);
            queue.offer(A[i][1]);
        }
        if (queue.size() == 0) return new int[0][0];
        int l, r;
        l = queue.poll();
        r = queue.poll();
        int[] tmp = new int[4];
        for (int i = 0; i < B.length; ) {
            if (B[i].length == 0) continue;
            int tl = B[i][0];
            int tr = B[i][1];
            if (!(l > tr || r < tl)) {
                tmp[0] = l;tmp[1]=r;tmp[2]=tl;tmp[3]=tr;
                Arrays.sort(tmp);
                list.add(tmp[1]);list.add(tmp[2]);
            }
            if (tr < r) i++;
            if (tr >= r) {
                if (queue.size() == 0) break;
                l = queue.poll();
                r = queue.poll();
            }
        }
        int[][] res = new int[list.size() >> 1][2];
        for (int i = 0; i < list.size(); i+=2) {
            res[i>>1][0] = list.get(i);
            res[i>>1][1] = list.get(i+1); 
        }
        return res;
    }
}