package binary_trees.optimal;

// Problem: Implement Trie (Prefix Tree)
// Approach: Optimal - TrieNode with children array
// Time Complexity: O(L) insert/search where L = word length
// Space Complexity: O(n * L)

public class ImplementTrieOptimal {

    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEnd = false;
    }

    TrieNode root = new TrieNode();

    public void insert(String word) {
        TrieNode curr = root;
        for (char c : word.toCharArray()) {
            int i = c - 'a';
            if (curr.children[i] == null) {
                curr.children[i] = new TrieNode();
            }
            curr = curr.children[i];
        }
        curr.isEnd = true;
    }

    public boolean search(String word) {
        TrieNode curr = root;
        for (char c : word.toCharArray()) {
            int i = c - 'a';
            if (curr.children[i] == null) return false;
            curr = curr.children[i];
        }
        return curr.isEnd;
    }

    public boolean startsWith(String prefix) {
        TrieNode curr = root;
        for (char c : prefix.toCharArray()) {
            int i = c - 'a';
            if (curr.children[i] == null) return false;
            curr = curr.children[i];
        }
        return true;
    }

    public static void main(String[] args) {
        ImplementTrieOptimal trie = new ImplementTrieOptimal();
        trie.insert("apple");
        System.out.println(trie.search("apple"));   // true
        System.out.println(trie.search("app"));     // false
        System.out.println(trie.startsWith("app")); // true
    }
}