package hash_tables.brute;

// Problem: Maximum Number of Balloons
// Approach: Brute Force - Count each character manually
// Time Complexity: O(n)
// Space Complexity: O(1)

public class MaximumNumberOfBalloonsBrute {

    public int maxNumberOfBalloons(String text) {
        int b = 0, a = 0, l = 0, o = 0, n = 0;

        // Count each required character one by one
        for (char c : text.toCharArray()) {
            if (c == 'b') b++;
            else if (c == 'a') a++;
            else if (c == 'l') l++;
            else if (c == 'o') o++;
            else if (c == 'n') n++;
        }

        // balloon = b(1) a(1) l(2) o(2) n(1)
        int count = b;
        count = Math.min(count, a);
        count = Math.min(count, l / 2);
        count = Math.min(count, o / 2);
        count = Math.min(count, n);

        return count;
    }

    public static void main(String[] args) {
        MaximumNumberOfBalloonsBrute sol = new MaximumNumberOfBalloonsBrute();
        System.out.println(sol.maxNumberOfBalloons("nlaebolko"));       // 1
        System.out.println(sol.maxNumberOfBalloons("loonbalxballoon")); // 2
    }
}