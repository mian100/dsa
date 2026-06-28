package two_pointers.brute;

// Problem: Valid Palindrome
// Approach: Brute Force - Clean string then compare to reverse
// Time Complexity: O(n)
// Space Complexity: O(n)

public class ValidPalindromeBrute {

    public boolean isPalindrome(String s) {
        // Keep only alphanumeric and lowercase
        StringBuilder clean = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                clean.append(Character.toLowerCase(c));
            }
        }

        // Compare with its reverse
        String original = clean.toString();
        String reversed = clean.reverse().toString();
        return original.equals(reversed);
    }

    public static void main(String[] args) {
        ValidPalindromeBrute sol = new ValidPalindromeBrute();
        System.out.println(sol.isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(sol.isPalindrome("race a car")); // false
    }
}
