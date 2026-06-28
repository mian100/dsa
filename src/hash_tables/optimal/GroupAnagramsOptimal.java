package hash_tables.optimal;
// Problem: Group Anagrams
// Approach: Optimal - Sort each word as key in HashMap
// Time Complexity: O(n * k log k)
// Space Complexity: O(n)

import java.util.*;

public class GroupAnagramsOptimal {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            // Sort word to use as key
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            // Add word to its anagram group
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        GroupAnagramsOptimal sol = new GroupAnagramsOptimal();
        System.out.println(sol.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
        // [[eat, tea, ate], [tan, nat], [bat]]
    }
}