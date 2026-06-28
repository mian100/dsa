package hash_tables.optimal;

// Problem: Valid Anagram
// Approach: Optimal - Frequency array comparison
// Time Complexity: O(n)
// Space Complexity: O(1)

public class ValidAnagramOptimal {

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        // Count frequency of each character
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;  // Increment for s
            freq[t.charAt(i) - 'a']--;  // Decrement for t
        }

        // If all zeros, strings are anagrams
        for (int count : freq) {
            if (count != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ValidAnagramOptimal sol = new ValidAnagramOptimal();
        System.out.println(sol.isAnagram("anagram", "nagaram")); // true
        System.out.println(sol.isAnagram("rat", "car"));         // false
    }
}