class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> lists = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            int temp = groupSizes[i];
            if (map.containsKey(temp)) {
                List<Integer> list = map.get(temp);
                if (list.size() < temp) {
                    list.add(i);
                    map.put(temp, list);
                } else if (list.size() == temp) {
                    lists.add(new ArrayList<>(list));
                    list.clear();
                    list.add(i);
                    map.put(temp, list);
                }
            }
            if (!map.containsKey(temp)) {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(temp, list);
            }
        }
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            lists.add(entry.getValue());
        }
        return lists;
    }
}