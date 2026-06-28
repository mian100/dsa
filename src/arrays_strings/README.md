# Arrays & Strings

## Problem List

| # | Problem | Difficulty | LeetCode |
|---|---------|------------|----------|
| 1 | Find Closest Number to Zero | Easy | [Link](https://leetcode.com/problems/find-closest-number-to-zero/) |
| 2 | Is Subsequence | Easy | [Link](https://leetcode.com/problems/is-subsequence/) |
| 3 | Summary Ranges | Easy | [Link](https://leetcode.com/problems/summary-ranges/) |
| 4 | Longest Common Prefix | Easy | [Link](https://leetcode.com/problems/longest-common-prefix/) |
| 5 | Best Time to Buy & Sell Stock | Easy | [Link](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) |

## Approach

**Find Closest Number to Zero:** Brute force linearly scans the array tracking the number with smallest absolute value. Optimal uses the same O(n) scan but handles the tie-breaking condition more concisely in a single if condition.

**Is Subsequence:** Brute force uses two nested loops to check every possible starting position in t. Optimal uses two pointers advancing independently through s and t in O(n+m).

**Summary Ranges:** Brute force checks every pair of indices O(n^2). Optimal uses a single pass with a start pointer to track range beginnings in O(n).

**Longest Common Prefix:** Brute force compares all pairs character by character. Optimal sorts the array lexicographically and only compares the first and last strings in O(n log n).

**Best Time to Buy & Sell Stock:** Brute force checks all pairs of buy/sell days O(n^2). Optimal tracks the running minimum price in a single pass O(n).

## Complexity Table

| Problem | Brute Time | Brute Space | Optimal Time | Optimal Space |
|---------|------------|-------------|--------------|---------------|
| Find Closest Number to Zero | O(n) | O(1) | O(n) | O(1) |
| Is Subsequence | O(n*m) | O(1) | O(n+m) | O(1) |
| Summary Ranges | O(n^2) | O(1) | O(n) | O(1) |
| Longest Common Prefix | O(n*m) | O(1) | O(n log n) | O(1) |
| Best Time to Buy & Sell Stock | O(n^2) | O(1) | O(n) | O(1) |

## How to Run

```
javac FindClosestNumberToZeroBrute.java && java FindClosestNumberToZeroBrute
javac FindClosestNumberToZeroOptimal.java && java FindClosestNumberToZeroOptimal
javac IsSubsequenceBrute.java && java IsSubsequenceBrute
javac IsSubsequenceOptimal.java && java IsSubsequenceOptimal
javac BestTimeToBuyAndSellStockBrute.java && java BestTimeToBuyAndSellStockBrute
javac BestTimeToBuyAndSellStockOptimal.java && java BestTimeToBuyAndSellStockOptimal
```