import java.util.HashMap;
import java.util.Map;

class Solution {
    public int subarraySum(int[] nums, int k) {
        int[] prefix = new int[nums.length + 1];
        for (int i = 1; i < nums.length + 1; i++) prefix[i] = prefix[i - 1] + nums[i - 1];
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int i = 0; i < prefix.length; i++) {
            if (map.containsKey(prefix[i])) {
                int num = map.get(prefix[i]);
                res += num;
            }
            map.computeIfPresent(prefix[i] + k, (a, b) -> b + 1);
            map.putIfAbsent(prefix[i] + k, 1);
        }
        return res;
    }
}