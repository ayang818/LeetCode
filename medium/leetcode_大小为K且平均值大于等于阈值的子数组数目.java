class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        if (arr.length == k) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum+=arr[i];
            }
            return sum/k >= threshold ? 1 : 0;
        }
        int[] prefix = new int[arr.length-k+1];
        int num = 0;
        for (int i = 0; i < k; i++) {
            prefix[0] += arr[i];
        }
        if (prefix[0]/k >= threshold) num++;
        for (int i = 1; i < arr.length-k+1; i++) {
            prefix[i] = prefix[i-1]-arr[i-1]+arr[i+k-1];
            if (prefix[i]/k >= threshold) num++;
        }
        return num;
    }
}