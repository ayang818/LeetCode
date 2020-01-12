class Solution {
    int[] list;
    public int makeConnected(int n, int[][] connections) {
        if (n-1 > connections.length) return -1;
        list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = i;
        }
        for (int i = 0; i< connections.length; i++) {
            merge(connections[i][0], connections[i][1]);
        }
        int num = 0;
        for (int i = 0; i < n; i++) {
            if (i == list[i]) {
                num++;
            }
        }
        if (num == 1) {
            return 0;
        } else {
            return num - 1;
        }
    }

    public void merge(int a, int b) {
        int finda = find(a);
        int findb = find(b);
        if (finda != findb) {
            list[finda] = list[findb];
        }
    }

    public int find(int a) {
        while (a != list[a]) {
            a = list[a];
        }
        return a;
    }
    
}