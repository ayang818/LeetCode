class Solution {
    public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
        List<Res> res = new ArrayList<>();
        for (int i = 0 ; i < restaurants.length; i++) {
            int[] rest = restaurants[i];
            if (veganFriendly == 1) {
                if (rest[2] == veganFriendly & rest[3] <= maxPrice & rest[4] <= maxDistance) {
                    res.add(new Res(rest[0], rest[1]));
                }
            } else {
                if (rest[3] <= maxPrice & rest[4] <= maxDistance) {
                    res.add(new Res(rest[0], rest[1]));
                }
            }
        }
        Collections.sort(res);
        Collections.reverse(res);
        List<Integer> l = new ArrayList<>();
        for (Res r : res) {
            l.add(r.id);
        }
        return l;
    }

    static class Res implements Comparable<Res> {
    public Integer id;
    public Integer rating;
    public Res(Integer id, Integer rate) {
        this.id = id;
        this.rating = rate;
    }
    public int compareTo(Res r2) {
        if (this.rating > r2.rating) {
            return 1;
        } else if (this.rating < r2.rating) {
            return -1;
        }
        if (this.id > r2.id) {
            return 1;
        } else {
            return -1;
        }
    }
}
}