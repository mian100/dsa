package arrays_strings.optimal;

import java.util.Arrays;

// Problem: Longest Common Prefix
// Approach: Optimal - Sort the array and compare the first and last strings
// Time Complexity: O(n log n)
// Space Complexity: O(1)

public class LongestCommonPrefixOptimal {

    public String longestCommonPrefix(String[] strs) {

        // Return empty string if the input is empty
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Sort the array
        Arrays.sort(strs);

        // After sorting, only first and last strings need comparison
        String first = strs[0];
        String last = strs[strs.length - 1];

        // Compare up to the length of the shorter string
        int limit = Math.min(first.length(), last.length());

        StringBuilder prefix = new StringBuilder();

        // Find the common prefix
        for (int i = 0; i < limit; i++) {

            // Stop when characters do not match
            if (first.charAt(i) != last.charAt(i)) {
                break;
            }

            // Add matching character to the prefix
            prefix.append(first.charAt(i));
        }

        return prefix.toString();
    }

    public static void main(String[] args) {

        LongestCommonPrefixOptimal sol = new LongestCommonPrefixOptimal();

        String[] strs1 = {"flower", "flow", "flight"};
        String[] strs2 = {"dog", "racecar", "car"};

        System.out.println(sol.longestCommonPrefix(strs1));
        System.out.println(sol.longestCommonPrefix(strs2));
    }
}