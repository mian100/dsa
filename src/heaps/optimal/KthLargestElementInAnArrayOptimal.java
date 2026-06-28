package heaps.optimal;

// Problem: Kth Largest Element in Array
// Approach: Optimal - Min heap of size k
// Time Complexity: O(n log k)
// Space Complexity: O(k)

import java.util.PriorityQueue;

public class KthLargestElementInAnArrayOptimal {

    public int findKthLargest(int[] nums, int k) {
        // Min heap of size k
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.offer(num);
            // Keep only k largest
            if (minHeap.size() > k) minHeap.poll();
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {
        KthLargestElementInAnArrayOptimal sol = new KthLargestElementInAnArrayOptimal();
        System.out.println(sol.findKthLargest(new int[]{3,2,1,5,6,4}, 2)); // 5
    }
}