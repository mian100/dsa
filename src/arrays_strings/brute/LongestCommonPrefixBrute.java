package arrays_strings.brute;

// Problem: Longest Common Prefix
// Approach: Brute Force - Compare characters one by one
// Time Complexity: O(n × m)
// Space Complexity: O(1)

public class LongestCommonPrefixBrute {

    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = "";

        // Compare characters one by one using the first string
        for (int i = 0; i < strs[0].length(); i++) {

            char ch = strs[0].charAt(i);

            // Check the same character in every string
            for (int j = 1; j < strs.length; j++) {

                if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
                    return prefix;
                }
            }

            // Extend the common prefix
            prefix += ch;
        }

        return prefix;
    }

    public static void main(String[] args) {

        LongestCommonPrefixBrute sol = new LongestCommonPrefixBrute();

        String[] strs1 = {"flower", "flow", "flight"};
        String[] strs2 = {"dog", "racecar", "car"};

        System.out.println(sol.longestCommonPrefix(strs1));
        System.out.println(sol.longestCommonPrefix(strs2));
    }
}
