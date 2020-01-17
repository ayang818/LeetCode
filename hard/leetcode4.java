import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] concatList = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            concatList[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            concatList[nums1.length + i] = nums2[i];
        }
        Arrays.sort(concatList);
        int length = concatList.length;
        if (length % 2 == 0) {
            return (concatList[length / 2] + concatList[length / 2 - 1]) / 2.0;
        }
        return (concatList[length / 2]);
    }
}

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;

        if (length1 == 0) {
            return length2 % 2 == 0 ? (nums2[(length2 / 2) - 1] + nums2[length2 / 2]) / 2.0 : nums2[length2 / 2];
        }
        if (length2 == 0) {
            return length1 % 2 == 0 ? (nums1[(length1 / 2) - 1] + nums1[length1 / 2]) / 2.0 : nums1[length1 / 2];
        }
        int length = length1 + length2;
        boolean isOdd = (length % 2 == 0);
        int num1Local = 0;
        int num2Local = 0;
        int i1 = length / 2 + 1;
        int[] ansList = new int[i1];
        for (int i = 0; i < i1; i++) {
            if (num1Local == length1) {
                ansList[i] = nums2[num2Local];
                num2Local++;
                continue;
            }
            if (num2Local == length2) {
                ansList[i] = nums1[num1Local];
                num1Local++;
                continue;
            }
            if (nums1[num1Local] > nums2[num2Local]) {
                ansList[i] = nums2[num2Local];
                num2Local++;
            } else {
                ansList[i] = nums1[num1Local];
                num1Local++;
            }
        }
        System.out.println(Arrays.toString(ansList));
        return isOdd ? (ansList[i1 - 1] + ansList[i1 - 2]) / 2.0 : ansList[i1 - 1];
    }
}