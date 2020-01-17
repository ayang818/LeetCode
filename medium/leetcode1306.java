class Solution {
    int[] nums;
    int length;
    int begin;
    Map<Integer, Integer> map = new HashMap<>();

    public boolean canReach(int[] arr, int start) {
        begin = start;
        nums = arr;
        length = nums.length;
        int over1 = start + nums[start];
        boolean isIn1 = over1 < length && over1 >= 0;
        int over2 = start - nums[start];
        boolean isIn2 = over2 < length && over2 >= 0;
        return (isIn1 && jump(start + nums[start])) || (isIn2 && jump(start - nums[start]));
    }

    public boolean jump(Integer start) {
        if (nums[start] == 0) {
            return true;
        }
        if (!map.containsKey(start)) {
            map.put(start, 1);
        } else {
            return false;
        }
        int over1 = start + nums[start];
        boolean isIn1 = over1 < length && over1 >= 0;
        int over2 = start - nums[start];
        boolean isIn2 = over2 < length && over2 >= 0;
        return (isIn1 && jump(start + nums[start])) || (isIn2 && jump(start - nums[start]));
    }
}