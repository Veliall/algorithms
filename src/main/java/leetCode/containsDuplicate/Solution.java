package leetCode.containsDuplicate;

import java.util.HashSet;

public class Solution {
    // speed O(n), space O(n)
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int integer : nums) {
            if (set.contains(integer)) {
                return true;
            }
            set.add(integer);
        }

        return false;
    }
}
