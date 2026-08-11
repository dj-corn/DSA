class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

    int[] merged = new int[n1 + n2];

    // merge arrays
    System.arraycopy(nums1, 0, merged, 0, n1);
    System.arraycopy(nums2, 0, merged, n1, n2);

    // sort merged array
    java.util.Arrays.sort(merged);

    int n = merged.length;

    // find median
    if (n % 2 == 0) {
        return (merged[n/2 - 1] + merged[n/2]) / 2.0;
    } else {
        return merged[n/2];
    }
    }
}