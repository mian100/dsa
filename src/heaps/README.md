# Heaps (Priority Queues)

## Problem List

| # | Problem | Difficulty | LeetCode |
|---|---------|------------|----------|
| 1 | Last Stone Weight | Easy | [Link](https://leetcode.com/problems/last-stone-weight/) |
| 2 | Kth Largest Element in Array | Medium | [Link](https://leetcode.com/problems/kth-largest-element-in-an-array/) |
| 3 | Top K Frequent Elements | Medium | [Link](https://leetcode.com/problems/top-k-frequent-elements/) |

## Approach

**Last Stone Weight:** Brute force sorts the array on every iteration to find the two heaviest stones O(n^2 log n). Optimal uses a max heap to always access the two heaviest stones efficiently O(n log n).

**Kth Largest Element:** Brute force sorts the array in ascending order and returns element at index n-k O(n log n). Optimal maintains a min heap of size k so the root is always the kth largest O(n log k).

**Top K Frequent Elements:** Brute force counts frequencies then sorts all elements by frequency O(n log n). Optimal uses a min heap of size k based on frequency achieving O(n log k).

## Complexity Table

| Problem | Brute Time | Brute Space | Optimal Time | Optimal Space |
|---------|------------|-------------|--------------|---------------|
| Last Stone Weight | O(n^2 log n) | O(1) | O(n log n) | O(n) |
| Kth Largest Element | O(n log n) | O(1) | O(n log k) | O(k) |
| Top K Frequent Elements | O(n log n) | O(n) | O(n log k) | O(n) |

## How to Run

```
javac LastStoneWeightBrute.java && java LastStoneWeightBrute
javac LastStoneWeightOptimal.java && java LastStoneWeightOptimal
javac KthLargestElementInAnArrayBrute.java && java KthLargestElementInAnArrayBrute
javac KthLargestElementInAnArrayOptimal.java && java KthLargestElementInAnArrayOptimal
javac TopKFrequentElementsBrute.java && java TopKFrequentElementsBrute
javac TopKFrequentElementsOptimal.java && java TopKFrequentElementsOptimal
```