import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class Solution {
    int target = 0;
    int total = 0;
    Set<List<Integer>> res;
    public List<List<Integer>> combine(int n, int k) {
        target = k;
        total = n;
        res = new HashSet<>();
        Set<Integer> tmp = new HashSet<>();
        combine(tmp, 1);
        List<List<Integer>> sa = new LinkedList<>();
        for (List<Integer> list : res) {
            sa.add(list);
        }
        return sa;
    }

    public void combine(Set<Integer> set, int start) {
        for (int i = start; i <= total; i++) {
            Set<Integer> tmp = new HashSet<>(set);
            if (check(tmp, i)) {
                if (tmp.size() == target) {
                    List<Integer> tmpR = new LinkedList<>(tmp);
                    res.add(tmpR);
                    continue;
                }
                combine(tmp, i+1);
            }
        }
    }

    public boolean check(Set<Integer> set, Integer num) {
        if (set.size() == target) {
            return true;
        }
        if (set.contains(num)) {
            return false;
        }
        set.add(num);
        return true;
    }
}