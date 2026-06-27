package hash_tables.optimal;

// Problem: Contains Duplicate
// Approach: Optimal - HashSet for O(1) lookup
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.HashSet;

public class ContainsDuplicateOptimal {

    public boolean containsDuplicate(int[] nums) {

        // HashSet stores unique elements
        HashSet<Integer> seen = new HashSet<>();

        for (int num : nums) {
            // If already in set, duplicate found
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num); // Add to set
        }
        return false; // No duplicate
    }

    public static void main(String[] args) {
        ContainsDuplicateOptimal sol = new ContainsDuplicateOptimal();
        System.out.println(sol.containsDuplicate(new int[]{1, 2, 3, 1})); // true
        System.out.println(sol.containsDuplicate(new int[]{1, 2, 3, 4})); // false
    }
}