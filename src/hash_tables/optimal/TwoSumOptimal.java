package hash_tables.optimal;

// Problem: Two Sum
// Approach: Optimal - HashMap stores complement
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.HashMap;

public class TwoSumOptimal {

    public int[] twoSum(int[] nums, int target) {

        // Map stores number → index
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // If complement already seen, we found our pair
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            // Store current number with its index
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        TwoSumOptimal sol = new TwoSumOptimal();
        int[] result = sol.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(result[0] + ", " + result[1]); // 0, 1
    }
}