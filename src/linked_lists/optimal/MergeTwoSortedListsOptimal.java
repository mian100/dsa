package linked_lists.optimal;

// Problem: Merge Two Sorted Lists
// Approach: Optimal - Two pointer merge in-place
// Time Complexity: O(n)
// Space Complexity: O(1)

public class MergeTwoSortedListsOptimal {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (list1 != null && list2 != null) {
            // Pick smaller value
            if (list1.val <= list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        // Attach remaining nodes
        if (list1 != null) curr.next = list1;
        if (list2 != null) curr.next = list2;

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        MergeTwoSortedListsOptimal sol = new MergeTwoSortedListsOptimal();
        ListNode result = sol.mergeTwoLists(l1, l2);
        while (result != null) {
            System.out.print(result.val + " "); // 1 1 2 3 4 4
            result = result.next;
        }
    }
}