package linked_lists.brute;

// Problem: Merge Two Sorted Lists
// Approach: Brute Force - Collect all, sort, rebuild
// Time Complexity: O(n log n)
// Space Complexity: O(n)

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeTwoSortedListsBrute {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> vals = new ArrayList<>();

        // Collect all values
        while (list1 != null) { vals.add(list1.val); list1 = list1.next; }
        while (list2 != null) { vals.add(list2.val); list2 = list2.next; }

        // Sort
        Collections.sort(vals);

        // Rebuild linked list
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int v : vals) {
            curr.next = new ListNode(v);
            curr = curr.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        MergeTwoSortedListsBrute sol = new MergeTwoSortedListsBrute();
        ListNode result = sol.mergeTwoLists(l1, l2);
        while (result != null) {
            System.out.print(result.val + " "); // 1 1 2 3 4 4
            result = result.next;
        }
    }
}