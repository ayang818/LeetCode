class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i< nums.length;i++,i++) {
            for (int j=0;j < nums[i]; j++) {
                list.add(nums[i+1]);
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i< list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}