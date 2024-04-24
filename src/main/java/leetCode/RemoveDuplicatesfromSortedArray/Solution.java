package leetCode.RemoveDuplicatesfromSortedArray;

import java.util.Arrays;

public class Solution {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }

        int uniqueIndex = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[uniqueIndex] != nums[i]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
            }
        }
        return uniqueIndex + 1;
    }

    public static void main(String[] args) {
        int[] ints = {1, 1, 2};
        var res = removeDuplicates(ints);
        System.out.println(res + " " + Arrays.toString(ints));

        int[] ints2 = {0,0,1,1,1,2,2,3,3,4};
        var res2 = removeDuplicates(ints2);
        System.out.println(res2 + " " + Arrays.toString(ints2));
    }

}
