import java.util.*;

class Solution {
    public boolean isPossible(int[] target) {
        long sum = 0;
        Comparator<Long> cmp = (a, b) -> (int) (b-a);
        Queue<Long> queue = new PriorityQueue(target.length, cmp);
        for(int i = 0; i < target.length; i++) {
            queue.offer((long) target[i]);
            sum+=target[i];
        }
        while (true) {
            long max = queue.poll();
            long tmp = max;
            if (max == 1) {
                return true;
            }
            max = max - (sum-max);
            queue.add(max);
            if (max < 1) {
                return false;
            }
            sum = tmp;
        }
    }
}