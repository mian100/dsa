package binary_trees.brute;

// Problem: Implement Trie (Prefix Tree)
// Approach: Brute Force - ArrayList of words
// Time Complexity: O(n) search
// Space Complexity: O(n)

import java.util.ArrayList;

public class ImplementTrieBrute {

    ArrayList<String> words = new ArrayList<>();

    public void insert(String word) {
        words.add(word);
    }

    public boolean search(String word) {
        return words.contains(word);
    }

    public boolean startsWith(String prefix) {
        for (String w : words) {
            if (w.startsWith(prefix)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ImplementTrieBrute trie = new ImplementTrieBrute();
        trie.insert("apple");
        System.out.println(trie.search("apple"));   // true
        System.out.println(trie.search("app"));     // false
        System.out.println(trie.startsWith("app")); // true
    }
}