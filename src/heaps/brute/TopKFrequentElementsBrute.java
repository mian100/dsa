package heaps.brute;

// Problem: Top K Frequent Elements
// Approach: Brute Force - Sort all by frequency
// Time Complexity: O(n log n)
// Space Complexity: O(n)

import java.util.*;

public class TopKFrequentElementsBrute {

    public int[] topKFrequent(int[] nums, int k) {
        // Count frequency
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) freq.put(num, freq.getOrDefault(num, 0) + 1);

        // Sort by frequency descending
        List<Integer> keys = new ArrayList<>(freq.keySet());
        keys.sort((a, b) -> freq.get(b) - freq.get(a));

        // Return top k
        int[] result = new int[k];
        for (int i = 0; i < k; i++) result[i] = keys.get(i);
        return result;
    }

    public static void main(String[] args) {
        TopKFrequentElementsBrute sol = new TopKFrequentElementsBrute();
        System.out.println(Arrays.toString(sol.topKFrequent(new int[]{1,1,1,2,2,3}, 2))); // [1,2]
    }
}