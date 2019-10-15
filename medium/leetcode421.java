package medium;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName leetcode421
 * @Dessription TODO
 * @Author 杨丰畅
 * @Date 2019/10/14 15:31
 **/
class Solution {
    public int findMaximumXOR(int[] nums) {
        int res = 0;
        int mask = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 31; i >= 0; i--) {
            mask = mask ^ (1 << i);
            for (int j = 0; j < nums.length; j++) {
//                取前缀32-i位
                set.add(mask & nums[j]);
            }
            int temp = res ^ (1 << i);
            for (Integer num : set) {
                if (set.contains(num ^ temp)) {
                    res = temp;
                }
            }
            set.clear();
        }
        return res;
    }
}
