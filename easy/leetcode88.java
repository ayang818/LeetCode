class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i]  = nums2[i];
            }
            return;
        }
        int total = m+n-1;
        m--;n--;
        while (total >= 0) {
            if (n < 0) break;
            if (m >= 0 && nums1[m] > nums2[n]) {
                nums1[total] = nums1[m];
                nums1[m] = 0;
                m--;
            } else {
                nums1[total] = nums2[n];
                n--;
            }
            total--;
        }
    }
}