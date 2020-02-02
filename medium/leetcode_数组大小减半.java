class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>(5000);
        for (Integer num : arr) {
            map.computeIfPresent(num, (tnum, oldValue) -> oldValue+1);
            map.putIfAbsent(num, 1);
        }
        int num = 0;
        Comparator<Map.Entry<Integer, Integer>> cp = (entry1, entry2) -> {
            return -(entry1.getValue() - entry2.getValue());
        }; 
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, cp);
        int size = 0;
        int len = 0;
        for (Map.Entry<Integer, Integer> entry : list) {
            size += entry.getValue();
            len++;
            if (size >= (arr.length >> 1)) {
                break;
            }
        }
        return len;
    }
}