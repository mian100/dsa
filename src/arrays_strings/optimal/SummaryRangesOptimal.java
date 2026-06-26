package arrays_strings.optimal;

import java.util.ArrayList;
import java.util.List;

// Problem: Summary Ranges
// Approach: Optimal - Single Pass
// Time Complexity: O(n)
// Space Complexity: O(n)

public class SummaryRangesOptimal {

    public List<String> summaryRanges(int[] nums) {

        List<String> result = new ArrayList<>();

        // Handle empty array
        if (nums == null || nums.length == 0) {
            return result;
        }

        int start = nums[0]; // Start of current range
        int prev = nums[0];  // Last element in current range

        // Traverse the array
        for (int i = 1; i < nums.length; i++) {

            int curr = nums[i];

            // Continue the current range
            if (curr == prev + 1) {
                prev = curr;
            } else {

                // Add the completed range
                if (start == prev) {
                    result.add(String.valueOf(start));
                } else {
                    result.add(start + "->" + prev);
                }

                // Start a new range
                start = curr;
                prev = curr;
            }
        }

        // Add the last range
        if (start == prev) {
            result.add(String.valueOf(start));
        } else {
            result.add(start + "->" + prev);
        }

        return result;
    }

    public static void main(String[] args) {

        SummaryRangesOptimal sol = new SummaryRangesOptimal();

        int[] nums = {0, 1, 2, 4, 5, 7};

        System.out.println(sol.summaryRanges(nums));
        // Output: [0->2, 4->5, 7]
    }
}
