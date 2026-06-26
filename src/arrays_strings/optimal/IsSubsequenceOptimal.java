package arrays_strings.optimal;

// Problem: Is Subsequence
// Approach: Optimal - Two Pointers
// Time Complexity: O(n + m)
// Space Complexity: O(1)

public class IsSubsequenceOptimal {

    // Returns true if s is a subsequence of t
    public boolean isSubsequence(String s, String t) {

        // If s is empty, it is always a subsequence
        if (s == null || s.isEmpty()) {
            return true;
        }

        // If t is empty but s is not, subsequence is impossible
        if (t == null || t.isEmpty()) {
            return false;
        }

        int sIndex = 0; // Pointer for string s
        int tIndex = 0; // Pointer for string t

        // Traverse both strings
        while (sIndex < s.length() && tIndex < t.length()) {

            // If characters match, move pointer in s
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
            }

            // Always move pointer in t
            tIndex++;
        }

        // If all characters in s were matched, it is a subsequence
        return sIndex == s.length();
    }

    public static void main(String[] args) {

        IsSubsequenceOptimal sol = new IsSubsequenceOptimal();

        System.out.println(sol.isSubsequence("ace", "abcde"));   // true
        System.out.println(sol.isSubsequence("aec", "abcde"));   // false
        System.out.println(sol.isSubsequence("", "abcde"));      // true
        System.out.println(sol.isSubsequence("abc", "ahbgdc"));  // true
        System.out.println(sol.isSubsequence("axc", "ahbgdc"));  // false
    }
}