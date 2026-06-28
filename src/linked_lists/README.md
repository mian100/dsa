# Linked Lists

## Problem List

| # | Problem | Difficulty | LeetCode |
|---|---------|------------|----------|
| 1 | Remove Duplicates from Sorted List | Easy | [Link](https://leetcode.com/problems/remove-duplicates-from-sorted-list/) |
| 2 | Linked List Cycle | Easy | [Link](https://leetcode.com/problems/linked-list-cycle/) |
| 3 | Merge Two Sorted Lists | Easy | [Link](https://leetcode.com/problems/merge-two-sorted-lists/) |

## Approach

**Remove Duplicates from Sorted List:** Brute force iterates and skips duplicate nodes using next pointer. Optimal uses nested while loop to skip all consecutive duplicates more efficiently in-place O(1) space.

**Linked List Cycle:** Brute force stores all visited nodes in a HashSet O(n) space. Optimal uses Floyd's cycle detection with fast and slow pointers meeting only if cycle exists O(1) space.

**Merge Two Sorted Lists:** Brute force collects all values, sorts them, and rebuilds the list O(n log n). Optimal uses two pointers merging in-place by comparing values O(n) O(1) extra space.

## Complexity Table

| Problem | Brute Time | Brute Space | Optimal Time | Optimal Space |
|---------|------------|-------------|--------------|---------------|
| Remove Duplicates | O(n) | O(n) | O(n) | O(1) |
| Linked List Cycle | O(n) | O(n) | O(n) | O(1) |
| Merge Two Sorted Lists | O(n log n) | O(n) | O(n) | O(1) |

## How to Run

```
javac RemoveDuplicatesFromSortedListBrute.java && java RemoveDuplicatesFromSortedListBrute
javac RemoveDuplicatesFromSortedListOptimal.java && java RemoveDuplicatesFromSortedListOptimal
javac LinkedListCycleBrute.java && java LinkedListCycleBrute
javac LinkedListCycleOptimal.java && java LinkedListCycleOptimal
javac MergeTwoSortedListsBrute.java && java MergeTwoSortedListsBrute
javac MergeTwoSortedListsOptimal.java && java MergeTwoSortedListsOptimal
```