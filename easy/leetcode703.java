class KthLargest {
    PriorityQueue<Integer> heap;
    int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        heap = new PriorityQueue();
        for (int num : nums) {
            if (heap.size() == k) {
                if (num > heap.peek()) {
                    heap.poll();
                } else continue;
            }
            heap.offer(num);
        }
    }
    
    public int add(int val) {
        if (heap.size() == k && val > heap.peek()) {
            heap.poll();
            heap.offer(val);
        }
        if (heap.size() < k) {
            heap.offer(val);
        }
        return heap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */