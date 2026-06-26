package arrays_strings.optimal;

// Problem: Find Closest Number to Zero
// Approach: Optimal - Linear Scan with positive tie-breaking
// Time Complexity: O(n)
// Space Complexity: O(1)
// Difference from Brute: Cleaner one-liner check using Math.abs
// instead of storing separate distance variables

public class FindClosestNumberToZeroOptimal {

    public int findClosestNumber(int[] nums) {
        int closest = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // One-liner check: more concise than brute force
            if (Math.abs(nums[i]) < Math.abs(closest) ||
                    (Math.abs(nums[i]) == Math.abs(closest) && nums[i] > closest)) {
                closest = nums[i];
            }
        }
        return closest;
    }

    public static void main(String[] args) {
        FindClosestNumberToZeroOptimal sol = new FindClosestNumberToZeroOptimal();
        System.out.println(sol.findClosestNumber(new int[]{-4, -2, 1, 4, 8})); // Output: 1
        System.out.println(sol.findClosestNumber(new int[]{-2, 2})); // Output: 2
    }
}