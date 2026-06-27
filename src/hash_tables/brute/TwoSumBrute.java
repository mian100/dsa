package hash_tables.brute;

// Problem: Two Sum
// Approach: Brute Force - Check all pairs
// Time Complexity: O(n^2)
// Space Complexity: O(1)

public class TwoSumBrute {

    public int[] twoSum(int[] nums, int target) {

        // Check every pair
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                // If pair sums to target, return indices
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        TwoSumBrute sol = new TwoSumBrute();
        int[] result = sol.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(result[0] + ", " + result[1]); // 0, 1
    }
}