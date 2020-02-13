class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int start = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] == arr2[i]) {
                    int temp = arr1[start];
                    arr1[start] = arr1[j];
                    arr1[j] = temp;
                    start++;
                }
            }
        }
        int[] tempList = new int[arr1.length - start];
        for (int i = start; i < arr1.length; i++) {
            tempList[i-start] = arr1[i];
        }
        Arrays.sort(tempList);
        for (int i = start; i < arr1.length; i++) {
            arr1[i] = tempList[i-start];
        }
        return arr1;
    }
}