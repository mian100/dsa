package arrays_strings.brute;

import java.util.ArrayList;
import java.util.List;

// Problem: Summary Ranges
// Approach: Brute Force - Expand each range using nested loops
// Time Complexity: O(n²)
// Space Complexity: O(n)

public class SummaryRangesBrute {

    // Converts a sorted array into a list of summary ranges
    public List<String> summaryRanges(int[] nums) {

        List<String> result = new ArrayList<>();

        // Handle empty array
        if (nums == null || nums.length == 0) {
            return result;
        }

        int i = 0;

        // Traverse the array
        while (i < nums.length) {

            int start = nums[i];
            int end = start;

            // Expand the current range
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[j] == end + 1) {
                    end = nums[j];
                } else {
                    break;
                }
            }

            // Add single number or range
            if (start == end) {
                result.add(String.valueOf(start));
            } else {
                result.add(start + "->" + end);
            }

            // Skip processed elements
            while (i < nums.length && nums[i] <= end) {
                i++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        SummaryRangesBrute sol = new SummaryRangesBrute();

        int[] nums = {0, 1, 2, 4, 5, 7};

        System.out.println(sol.summaryRanges(nums));
        // Output: [0->2, 4->5, 7]
    }
}