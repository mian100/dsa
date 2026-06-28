# Binary Trees

## Problem List

| # | Problem | Difficulty | LeetCode |
|---|---------|------------|----------|
| 1 | Invert Binary Tree | Easy | [Link](https://leetcode.com/problems/invert-binary-tree/) |
| 2 | Maximum Depth of Binary Tree | Easy | [Link](https://leetcode.com/problems/maximum-depth-of-binary-tree/) |
| 3 | Kth Smallest Element in BST | Medium | [Link](https://leetcode.com/problems/kth-smallest-element-in-a-bst/) |
| 4 | Diameter of Binary Tree | Easy | [Link](https://leetcode.com/problems/diameter-of-binary-tree/) |
| 5 | Validate Binary Search Tree | Medium | [Link](https://leetcode.com/problems/validate-binary-search-tree/) |
| 6 | Implement Trie (Prefix Tree) | Medium | [Link](https://leetcode.com/problems/implement-trie-prefix-tree/) |
| 7 | Minimum Absolute Difference in BST | Easy | [Link](https://leetcode.com/problems/minimum-absolute-difference-in-bst/) |

## Approach

**Invert Binary Tree:** Brute force uses iterative BFS with a queue to swap children level by level. Optimal uses recursive DFS which is more elegant and concise O(n).

**Maximum Depth of Binary Tree:** Brute force uses BFS counting levels. Optimal uses DFS returning 1 + max(left, right) recursively O(n).

**Kth Smallest in BST:** Brute force collects all inorder values in a list and returns index k-1 O(n). Optimal uses iterative inorder traversal stopping exactly at the kth element O(k).

**Diameter of Binary Tree:** Brute force computes left and right heights for every node separately O(n^2). Optimal uses a single DFS pass updating a global max diameter O(n).

**Validate BST:** Brute force does inorder traversal and checks if result is sorted O(n). Optimal uses DFS with min/max bounds passed down to each node O(n).

**Implement Trie:** Brute force stores all words in an ArrayList and searches linearly. Optimal uses TrieNode with a children array for O(L) insert and search where L is word length.

**Minimum Absolute Difference in BST:** Brute force collects inorder values and compares all pairs O(n^2). Optimal uses inorder traversal with a prev pointer comparing only adjacent nodes O(n).

## Complexity Table

| Problem | Brute Time | Brute Space | Optimal Time | Optimal Space |
|---------|------------|-------------|--------------|---------------|
| Invert Binary Tree | O(n) | O(n) | O(n) | O(h) |
| Maximum Depth | O(n) | O(n) | O(n) | O(h) |
| Kth Smallest in BST | O(n) | O(n) | O(k) | O(h) |
| Diameter of Binary Tree | O(n^2) | O(n) | O(n) | O(h) |
| Validate BST | O(n) | O(n) | O(n) | O(h) |
| Implement Trie | O(n) | O(n) | O(L) | O(n*L) |
| Min Abs Diff in BST | O(n^2) | O(n) | O(n) | O(h) |

## How to Run

```
javac InvertBinaryTreeBrute.java && java InvertBinaryTreeBrute
javac InvertBinaryTreeOptimal.java && java InvertBinaryTreeOptimal
javac MaximumDepthOfBinaryTreeBrute.java && java MaximumDepthOfBinaryTreeBrute
javac MaximumDepthOfBinaryTreeOptimal.java && java MaximumDepthOfBinaryTreeOptimal
javac ImplementTrieBrute.java && java ImplementTrieBrute
javac ImplementTrieOptimal.java && java ImplementTrieOptimal
```