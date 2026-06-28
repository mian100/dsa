package linked_lists.optimal;

// Problem: Remove Duplicates from Sorted List
// Approach: Optimal - Single pointer, skip duplicates in-place
// Time Complexity: O(n)
// Space Complexity: O(1)

public class RemoveDuplicatesFromSortedListOptimal {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            // Skip all nodes with same value
            while (curr.next != null && curr.val == curr.next.val) {
                curr.next = curr.next.next;
            }
            curr = curr.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        RemoveDuplicatesFromSortedListOptimal sol = new RemoveDuplicatesFromSortedListOptimal();
        ListNode result = sol.deleteDuplicates(head);
        while (result != null) {
            System.out.print(result.val + " "); // 1 2
            result = result.next;
        }
    }
}
