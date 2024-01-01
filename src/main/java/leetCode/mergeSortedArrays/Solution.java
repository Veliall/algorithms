package leetCode.mergeSortedArrays;

/**
 * To efficiently merge these arrays, we leverage the fact that we have empty space at the end of nums1
 * where n zeros are placed. This allows us to fill nums1 from the end (right to left),
 * placing the largest elements first and avoiding the need for shifting.
 * <p>
 * We use a two-pointer approach. The first pointer i starts at the last actual element in nums1,
 * and the second pointer j starts at the last element in nums2.
 * We also have a third pointer k that starts at the very end of nums1,
 * and it indicates where the next element should be placed.
 * <p>
 * Each step involves comparing the elements pointed by i and j.
 * The larger of the two elements is placed at the position indicated by k,
 * and then we move the respective pointer (i or j) and k one step back.
 * We repeat this process until all elements from nums2 are placed into nums1.
 * If nums1 still has elements left when nums2 runs out, they are already in place as the array is sorted.
 * If nums2 had the greatest element, it would be placed last,
 * ensuring the non-decreasing order is maintained throughout the process.
 */

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int indexNums1 = m - 1;
        int indexNums2 = n - 1;
        int mergedIndex = m + n - 1;

        while (indexNums2 >= 0) {
            if (indexNums1 >= 0 && nums1[indexNums1] > nums2[indexNums2]) {
                nums1[mergedIndex] = nums1[indexNums1];
                indexNums1--;
            } else {
                nums1[mergedIndex] = nums2[indexNums2];
                indexNums2--;
            }
            mergedIndex--;
        }
    }
}
