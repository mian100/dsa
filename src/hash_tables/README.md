# Hash Tables

## Problem List

| # | Problem | Difficulty | LeetCode |
|---|---------|------------|----------|
| 1 | Contains Duplicate | Easy | [Link](https://leetcode.com/problems/contains-duplicate/) |
| 2 | Two Sum | Easy | [Link](https://leetcode.com/problems/two-sum/) |
| 3 | Maximum Number of Balloons | Easy | [Link](https://leetcode.com/problems/maximum-number-of-balloons/) |
| 4 | Valid Anagram | Easy | [Link](https://leetcode.com/problems/valid-anagram/) |
| 5 | Group Anagrams | Medium | [Link](https://leetcode.com/problems/group-anagrams/) |

## Approach

**Contains Duplicate:** Brute force sorts the array and compares adjacent elements O(n log n). Optimal uses a HashSet for O(1) lookup, achieving O(n) time.

**Two Sum:** Brute force checks all pairs of numbers O(n^2). Optimal uses a HashMap to store complements and finds the answer in one pass O(n).

**Maximum Number of Balloons:** Brute force manually counts each required character using if-else conditions. Optimal uses a frequency array with floor division for repeated characters l and o.

**Valid Anagram:** Brute force sorts both strings and compares O(n log n). Optimal uses a frequency array incrementing for s and decrementing for t in O(n).

**Group Anagrams:** Brute force compares every pair of strings O(n^2 * k). Optimal sorts each word as a key in a HashMap grouping anagrams together O(n * k log k).

## Complexity Table

| Problem | Brute Time | Brute Space | Optimal Time | Optimal Space |
|---------|------------|-------------|--------------|---------------|
| Contains Duplicate | O(n log n) | O(1) | O(n) | O(n) |
| Two Sum | O(n^2) | O(1) | O(n) | O(n) |
| Maximum Number of Balloons | O(n) | O(1) | O(n) | O(1) |
| Valid Anagram | O(n log n) | O(n) | O(n) | O(1) |
| Group Anagrams | O(n^2 * k) | O(n) | O(n * k log k) | O(n) |

## How to Run

```
javac ContainsDuplicateBrute.java && java ContainsDuplicateBrute
javac ContainsDuplicateOptimal.java && java ContainsDuplicateOptimal
javac TwoSumBrute.java && java TwoSumBrute
javac TwoSumOptimal.java && java TwoSumOptimal
javac GroupAnagramsBrute.java && java GroupAnagramsBrute
javac GroupAnagramsOptimal.java && java GroupAnagramsOptimal
```