package heaps.brute;

// Problem: Kth Largest Element in Array
// Approach: Brute Force - Sort descending, return index k-1
// Time Complexity: O(n log n)
// Space Complexity: O(1)

import java.util.Arrays;

public class KthLargestElementInAnArrayBrute {

    public int findKthLargest(int[] nums, int k) {
        // Sort in descending order
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public static void main(String[] args) {
        KthLargestElementInAnArrayBrute sol = new KthLargestElementInAnArrayBrute();
        System.out.println(sol.findKthLargest(new int[]{3,2,1,5,6,4}, 2)); // 5
    }
}
