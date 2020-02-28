import java.util.List;

class Solution {
    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
        move(A.size(), A, B, C);
    }

    public void move(int num, List<Integer> from, List<Integer> tmp, List<Integer> to) {
        if (num == 1) {
            to.add(from.get(from.size()-1));
            from.remove(from.size()-1);
            return;
        }
        move(num - 1, from, to, tmp);
        to.add(from.get(from.size()-1));
        from.remove(from.size()-1);
        move(num - 1, tmp, from, to);
    }
}