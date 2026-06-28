# Two Pointers

## Problem List

| # | Problem | Difficulty | LeetCode |
|---|---------|------------|----------|
| 1 | Reverse String | Easy | [Link](https://leetcode.com/problems/reverse-string/) |
| 2 | Valid Palindrome | Easy | [Link](https://leetcode.com/problems/valid-palindrome/) |
| 3 | Container With Most Water | Medium | [Link](https://leetcode.com/problems/container-with-most-water/) |

## Approach

**Reverse String:** Brute force uses an extra array to fill in reverse order O(n) space. Optimal swaps elements in-place using two pointers from both ends O(1) space.

**Valid Palindrome:** Brute force cleans the string and compares it to its reverse O(n) space. Optimal uses two pointers from both ends skipping non-alphanumeric characters O(1) space.

**Container With Most Water:** Brute force checks all pairs of heights O(n^2). Optimal uses two pointers always moving the shorter side inward O(n).

## Complexity Table

| Problem | Brute Time | Brute Space | Optimal Time | Optimal Space |
|---------|------------|-------------|--------------|---------------|
| Reverse String | O(n) | O(n) | O(n) | O(1) |
| Valid Palindrome | O(n) | O(n) | O(n) | O(1) |
| Container With Most Water | O(n^2) | O(1) | O(n) | O(1) |

## How to Run

```
javac ReverseStringBrute.java && java ReverseStringBrute
javac ReverseStringOptimal.java && java ReverseStringOptimal
javac ValidPalindromeBrute.java && java ValidPalindromeBrute
javac ValidPalindromeOptimal.java && java ValidPalindromeOptimal
javac ContainerWithMostWaterBrute.java && java ContainerWithMostWaterBrute
javac ContainerWithMostWaterOptimal.java && java ContainerWithMostWaterOptimal
```