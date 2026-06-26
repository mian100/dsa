package arrays_strings.brute;

// Problem: Find Closest Number to Zero
// Approach: Brute Force - Linear Scan
// Time Complexity: O(n)
// Space Complexity: O(1)

public class FindClosestNumberToZeroBrute {

    public int findClosestNumber(int[] nums) {
        int closest = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];
            int closestDist = Math.abs(closest);
            int currentDist = Math.abs(current);

            // If current number is closer to zero, update answer
            if (currentDist < closestDist) {
                closest = current;
            }
            // If equally close, pick the positive one
            else if (currentDist == closestDist && current > closest) {
                closest = current;
            }
        }
        return closest;
    }

    public static void main(String[] args) {
        FindClosestNumberToZeroBrute sol = new FindClosestNumberToZeroBrute();
        System.out.println(sol.findClosestNumber(new int[]{-4, -2, 1, 4, 8})); // Output: 1
        System.out.println(sol.findClosestNumber(new int[]{-2, 2})); // Output: 2
    }
}