package heaps.optimal;

// Problem: Top K Frequent Elements
// Approach: Optimal - Min heap of size k
// Time Complexity: O(n log k)
// Space Complexity: O(n)

import java.util.*;

public class TopKFrequentElementsOptimal {

    public int[] topKFrequent(int[] nums, int k) {
        // Count frequency
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) freq.put(num, freq.getOrDefault(num, 0) + 1);

        // Min heap based on frequency
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(
                (a, b) -> freq.get(a) - freq.get(b)
        );

        for (int num : freq.keySet()) {
            minHeap.offer(num);
            if (minHeap.size() > k) minHeap.poll();
        }

        // Build result
        int[] result = new int[k];
        for (int i = 0; i < k; i++) result[i] = minHeap.poll();
        return result;
    }

    public static void main(String[] args) {
        TopKFrequentElementsOptimal sol = new TopKFrequentElementsOptimal();
        System.out.println(Arrays.toString(sol.topKFrequent(new int[]{1,1,1,2,2,3}, 2))); // [1,2]
    }
}
