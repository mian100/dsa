package two_pointers.brute;

// Problem: Reverse String
// Approach: Brute Force - Extra array, reverse fill
// Time Complexity: O(n)
// Space Complexity: O(n)

public class ReverseStringBrute {

    public void reverseString(char[] s) {
        char[] temp = new char[s.length];

        // Fill temp array in reverse order
        for (int i = 0; i < s.length; i++) {
            temp[i] = s[s.length - 1 - i];
        }

        // Copy back to original array
        for (int i = 0; i < s.length; i++) {
            s[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        ReverseStringBrute sol = new ReverseStringBrute();
        char[] s = {'h','e','l','l','o'};
        sol.reverseString(s);
        System.out.println(new String(s)); // olleh
    }
}