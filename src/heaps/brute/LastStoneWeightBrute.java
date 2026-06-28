package heaps.brute;


// Problem: Last Stone Weight
// Approach: Brute Force - Sort on every iteration
// Time Complexity: O(n^2 log n)
// Space Complexity: O(1)

import java.util.Arrays;

public class LastStoneWeightBrute {

    public int lastStoneWeight(int[] stones) {
        int n = stones.length;

        while (n > 1) {
            Arrays.sort(stones, 0, n);

            int y = stones[n - 1]; // heaviest
            int x = stones[n - 2]; // second heaviest

            if (x == y) {
                n -= 2; // both destroyed
            } else {
                stones[n - 2] = y - x; // remainder
                n -= 1;
            }
        }
        return n == 1 ? stones[0] : 0;
    }

    public static void main(String[] args) {
        LastStoneWeightBrute sol = new LastStoneWeightBrute();
        System.out.println(sol.lastStoneWeight(new int[]{2,7,4,1,8,1})); // 1
    }
}