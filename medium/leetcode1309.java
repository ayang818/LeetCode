class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] xor = new int[arr.length+1];
        for(int i = 0; i < arr.length; i++){
            xor[i+1] = xor[i]^arr[i];
        }
        int[] ans = new int[queries.length];
        int i = 0;
        for(int[] query : queries){
            int l = query[0], r = query[1];
            ans[i++] = xor[r+1]^xor[l];
        }
        return ans;
    }
}