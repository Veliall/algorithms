package leetCode.moveZeroes;

public class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length == 1) return;

        int leftPointer = 0;
        for (int rightPointer = 0; rightPointer < nums.length; rightPointer++) {
            if (nums[rightPointer] != 0) {
                int temp = nums[leftPointer];
                nums[leftPointer] = nums[rightPointer];
                nums[rightPointer] = temp;
                leftPointer++;
            }
        }
    }
}
