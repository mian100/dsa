package hash_tables.brute;

// Problem: Group Anagrams
// Approach: Brute Force - Compare every pair O(n^2 * k)
// Time Complexity: O(n^2 * k)
// Space Complexity: O(n)

import java.util.*;

public class GroupAnagramsBrute {

    public List<List<String>> groupAnagrams(String[] strs) {
        boolean[] visited = new boolean[strs.length];
        List<List<String>> result = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            if (visited[i]) continue;

            List<String> group = new ArrayList<>();
            group.add(strs[i]);

            // Compare with every other string
            for (int j = i + 1; j < strs.length; j++) {
                if (!visited[j] && isAnagram(strs[i], strs[j])) {
                    group.add(strs[j]);
                    visited[j] = true;
                }
            }
            result.add(group);
            visited[i] = true;
        }
        return result;
    }

    // Check if two strings are anagrams
    private boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        GroupAnagramsBrute sol = new GroupAnagramsBrute();
        System.out.println(sol.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }
}