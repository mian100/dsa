package hash_tables.brute;

import java.util.Arrays;
// Problem: Contains Duplicate
// Approach: Brute Force - Sort then compare adjacent
// Time Complexity: O(n log n)
// Space Complexity: O(1)

public class ContainsDuplicateBrute {

    public boolean containsDuplicate(int[] nums) {

        // Sort the array first
        Arrays.sort(nums);

        // Compare adjacent elements
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicateBrute sol = new ContainsDuplicateBrute();
        System.out.println(sol.containsDuplicate(new int[]{1, 2, 3, 1})); // true
        System.out.println(sol.containsDuplicate(new int[]{1, 2, 3, 4})); // false
    }
}