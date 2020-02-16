class ProductOfNumbers {

    List<Integer> list;

    public ProductOfNumbers() {
        this.list = new ArrayList<>();
    }
    
    public void add(int num) {
        list.add(num);
    }
    
    public int getProduct(int k) {
        int tmp = 1;
        for(int i = list.size() - 1,j=0; j < k;i--,j++ ) {
            if (list.get(i) == 0) return 0;
            if (list.get(i) == 1) continue;
            tmp *= list.get(i);
        }
        return tmp;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */