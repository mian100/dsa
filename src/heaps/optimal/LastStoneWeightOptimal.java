package heaps.optimal;

// Problem: Last Stone Weight
// Approach: Optimal - Max Heap (negate values)
// Time Complexity: O(n log n)
// Space Complexity: O(n)

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeightOptimal {

    public int lastStoneWeight(int[] stones) {
        // Max heap using reverse order
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int stone : stones) maxHeap.offer(stone);

        while (maxHeap.size() > 1) {
            int y = maxHeap.poll(); // heaviest
            int x = maxHeap.poll(); // second heaviest

            if (x != y) maxHeap.offer(y - x); // remainder back
        }
        return maxHeap.isEmpty() ? 0 : maxHeap.poll();
    }

    public static void main(String[] args) {
        LastStoneWeightOptimal sol = new LastStoneWeightOptimal();
        System.out.println(sol.lastStoneWeight(new int[]{2,7,4,1,8,1})); // 1
    }
}