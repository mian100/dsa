package linked_lists.brute;

// Problem: Linked List Cycle
// Approach: Brute Force - Store visited nodes in HashSet
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.HashSet;

public class LinkedListCycleBrute {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> visited = new HashSet<>();
        ListNode curr = head;
        while (curr != null) {
            // If node already visited, cycle exists
            if (visited.contains(curr)) return true;
            visited.add(curr);
            curr = curr.next;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next; // cycle
        LinkedListCycleBrute sol = new LinkedListCycleBrute();
        System.out.println(sol.hasCycle(head)); // true
    }
}