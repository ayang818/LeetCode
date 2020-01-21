class Solution {
    public List<Integer> sortArray(int[] nums) {
        if(nums.length <=1) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                list.add(nums[i]);
            }
            return list;
        }
        qSort(nums,0,nums.length-1);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        return list;
    }

    void qSort(int[] arr,int s,int e){
        int l = s, r = e;
        if(l < r){
            int temp = arr[l];
            while(l < r){
                // 标兵的作用就是这个点没有用了，可以被替换了
                // 移动右标兵
                while(l < r && arr[r] >= temp) {
                    r--;
                }
                if(l < r) {
                    arr[l] = arr[r];
                }
                // 移动左标兵
                while(l < r && arr[l] < temp) {
                    l++;
                }
                if(l < r) {
                    arr[r] = arr[l];
                }
            }
            arr[l] = temp;
            qSort(arr,s,l);
            qSort(arr,l + 1, e);
        }
    } 
}