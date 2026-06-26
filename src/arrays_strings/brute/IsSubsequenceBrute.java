package arrays_strings.brute;

public class IsSubsequenceBrute {

    // Problem: Is Subsequence
    // Brute Force Approach: Try matching from every possible starting position in t
    // Time Complexity: O(n * m)
    // Space Complexity: O(1)

    public boolean isSubsequence(String s, String t) {


        // Check every possible starting position in t
        for (int i = 0; i <= t.length() - s.length(); i++) {

            int sIndex = 0;
            int tIndex = i;

            // Try to match s from current position
            while (sIndex < s.length() && tIndex < t.length()) {

                if (s.charAt(sIndex) == t.charAt(tIndex)) {
                    sIndex++;
                }

                tIndex++;
            }

            // All characters matched
            if (sIndex == s.length()) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        IsSubsequenceBrute sol = new IsSubsequenceBrute();

        System.out.println(sol.isSubsequence("ace", "abcde")); // true
        System.out.println(sol.isSubsequence("aec", "abcde")); // false
        System.out.println(sol.isSubsequence("", "abcde"));    // true
    }
}