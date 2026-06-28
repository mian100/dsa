package hash_tables.brute;

// Problem: Valid Anagram
// Approach: Brute Force - Sort both strings and compare
// Time Complexity: O(n log n)
// Space Complexity: O(n)

import java.util.Arrays;

public class ValidAnagramBrute {

    public boolean isAnagram(String s, String t) {

        // If lengths differ, cannot be anagram
        if (s.length() != t.length()) return false;

        // Sort both strings and compare
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr, tArr);
    }

    public static void main(String[] args) {
        ValidAnagramBrute sol = new ValidAnagramBrute();
        System.out.println(sol.isAnagram("anagram", "nagaram")); // true
        System.out.println(sol.isAnagram("rat", "car"));         // false
    }
}