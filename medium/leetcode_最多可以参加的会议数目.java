class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]!=o2[1]) return o1[1]-o2[1];
                else return o1[0]-o2[0];
            }
        });
        boolean[] vis=new boolean[100005];
        int res=0;
        for(int[] it:events){
            for(int i=it[0];i<=it[1];i++){
                if(!vis[i]){
                    vis[i]=true;
                    res++;
                    break;
                }
            }
        }
        return res;
    }
}