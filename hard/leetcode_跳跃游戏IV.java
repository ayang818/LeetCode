class Solution {
    int[] list;
    int[] counter;
    int min = Integer.MAX_VALUE;
    Map<Integer, Set<Integer>> numberMap;
    public int minJumps(int[] arr) {
        if (arr.length == 1) return 0;
        if (arr.length == )
        list = arr;
        counter = new int[arr.length];
        for (int i = 0; i < list.length; i++) {
            counter[i] = i;
        }
        List<Integer> times = new ArrayList<>();
        numberMap = new HashMap<>();
        for (int i = 0; i < list.length; i++) {
            if (numberMap.containsKey(arr[i])) {
                Set<Integer> temp = numberMap.get(arr[i]);
                temp.add(i);
                numberMap.put(arr[i],temp);
            } else {
                Set<Integer> temp = new HashSet<>();
                temp.add(i);
                numberMap.put(arr[i], temp);
            }
        }
        jump(0, times, 0);
        return min;
    }
    
    public void jump(int p, List<Integer> times, Integer time) {
        if (p < 0 || p >= list.length || time > counter[p] || time > list.length-1) return;
        if (p == list.length-1) {
            min = Math.min(time, min);
            return;
        } else {
            counter[p] = Math.min(time, counter[p]);
        }
        jump(p+1, times, time+1);
        if (p+1 == list.length - 1) return;
        jump(p-1, times, time+1);
        Set<Integer> temp = numberMap.get(list[p]);
        for (Integer underCase : temp) {
            if (underCase == p) continue;
            jump(underCase, times, time+1);
        }
    }
}