class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Map<Integer, Integer> hash = new HashMap<>();
        for (int i =0; i< nums.length ; i ++) {
            int target = -nums[i];
            Map<Integer, Integer> map = new HashMap<>();
            Integer condition = hash.get(nums[i]);
            if (condition != null && condition == 1) {
                continue;
            }
            hash.put(nums[i],1);
            for (int j = 0; j < nums.length ;j ++) {
                if (i == j) {
                    continue;
                }
                if (!map.containsKey(nums[j])) {
                    map.put(target-nums[j], j);
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[map.get(nums[j])]);
                    list.add(nums[j]);
                    Collections.sort(list);
                    set.add(list);
                }
            }
        }
        return new ArrayList<>(set);
    }
}