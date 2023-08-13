package leetCode.twoSum;

import java.util.HashMap;

public class Solution {
    // speed O(n) space O(n)
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        HashMap<Integer, Integer> summand = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (summand.containsKey(target - nums[i])) {
                result[0] = summand.get(target - nums[i]);
                result[1] = i;
            }
            summand.put(nums[i], i);
        }

        return result;
    }
}
