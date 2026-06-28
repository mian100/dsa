package two_pointers.optimal;

// Problem: Reverse String
// Approach: Optimal - In-place swap with two pointers
// Time Complexity: O(n)
// Space Complexity: O(1)

public class ReverseStringOptimal {

    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        // Swap from both ends moving inward
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        ReverseStringOptimal sol = new ReverseStringOptimal();
        char[] s = {'h','e','l','l','o'};
        sol.reverseString(s);
        System.out.println(new String(s)); // olleh
    }
}