package linked_lists.brute;

// Problem: Remove Duplicates from Sorted List
// Approach: Brute Force - Convert to list, deduplicate, rebuild
// Time Complexity: O(n)
// Space Complexity: O(n)

public class RemoveDuplicatesFromSortedListBrute {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            // If duplicate found, skip it
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        RemoveDuplicatesFromSortedListBrute sol = new RemoveDuplicatesFromSortedListBrute();
        ListNode result = sol.deleteDuplicates(head);
        while (result != null) {
            System.out.print(result.val + " "); // 1 2
            result = result.next;
        }
    }
}