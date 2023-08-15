package leetCode.topKFrequentElements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> counts = new HashMap<>();
        int maxFrequency = 0;
        for (int num : nums) {
            int frequency = counts.getOrDefault(num, 0) + 1;
            maxFrequency = Math.max(frequency, maxFrequency);
            counts.merge(num, 1, Integer::sum);
        }

        List<Integer>[] freq = new ArrayList[maxFrequency + 1];
        for (Integer num : counts.keySet()) {
            if (freq[counts.get(num)] == null) {
                freq[counts.get(num)] = new ArrayList<>();
            }
            freq[counts.get(num)].add(num);
        }

        int[] result = new int[k];

        int j = 0;
        for (int i = freq.length - 1; i >= 0; i--) {
            if (freq[i] != null) {
                for (int num : freq[i]) {
                    result[j] = num;
                    j++;
                    if (j == k) return result;
                }
            }
        }

        return result;
    }
}
