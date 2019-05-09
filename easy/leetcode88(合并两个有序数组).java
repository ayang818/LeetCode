import java.util.Arrays;

// import com.sun.tools.javac.code.Attribute.Array;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int local = 0;
        for (int i=m; i<m+n; i++)
        {
            nums1[i] = nums2[i - m];
        }
        // nums1 = Arrays.copyOf(nums1, n+m);
        Arrays.sort(nums1);
        // System.out.println(Arrays.toString(nums1));
    }
}
