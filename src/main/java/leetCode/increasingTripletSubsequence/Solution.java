package leetCode.increasingTripletSubsequence;

public class Solution {
    public boolean increasingTriplet(int[] nums) {

        int min = Integer.MAX_VALUE;
        int mid = Integer.MAX_VALUE;

        for (int integer : nums) {
            if (integer <= min) {
                min = integer;
                continue;
            }

            if (integer < mid) {
                mid = integer;
                continue;
            }

            if (integer > mid) return true;
        }

        return false;
    }
}
