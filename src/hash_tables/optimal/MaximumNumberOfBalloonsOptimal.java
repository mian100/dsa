package hash_tables.optimal;

// Problem: Maximum Number of Balloons
// Approach: Optimal - Frequency array
// Time Complexity: O(n)
// Space Complexity: O(1)

public class MaximumNumberOfBalloonsOptimal {

    public int maxNumberOfBalloons(String text) {
        int[] freq = new int[26];

        // Count all characters
        for (char c : text.toCharArray()) {
            freq[c - 'a']++;
        }

        // Check how many "balloon" words we can form
        return Math.min(Math.min(Math.min(freq['b'-'a'], freq['a'-'a']),
                        Math.min(freq['l'-'a'] / 2, freq['o'-'a'] / 2)),
                freq['n'-'a']);
    }

    public static void main(String[] args) {
        MaximumNumberOfBalloonsOptimal sol = new MaximumNumberOfBalloonsOptimal();
        System.out.println(sol.maxNumberOfBalloons("nlaebolko"));    // 1
        System.out.println(sol.maxNumberOfBalloons("loonbalxballoon")); // 2
    }
}