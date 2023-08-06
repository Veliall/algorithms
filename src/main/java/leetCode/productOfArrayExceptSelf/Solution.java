package leetCode.productOfArrayExceptSelf;

import java.util.Arrays;

public class Solution {
    public int[] productExceptSelf(int[] nums) {

        int [] result = new int[nums.length];
        result[0] = 1;

        for (int i = 0; i < nums.length - 1; i ++) {
            result[i + 1] = result[i] * nums[i];
        }

        int postfix = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            result[i] *= postfix;
            postfix *= nums[i];
        }

        return result;
    }
}
