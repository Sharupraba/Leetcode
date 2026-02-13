// Last updated: 2/13/2026, 9:48:36 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // If the list is empty or has only one node, nothing to do
        if (head == null || head.next == null) {
            return head;
        }

        // Pointer to current node
        ListNode current = head;

        // Loop through the list
        while (current.next != null) {
            // If current and next node have the same value
            if (current.val == current.next.val) {
                // Skip the next node
                current.next = current.next.next;
            } else {
                // Move to next node
                current = current.next;
            }
        }

        // Return the updated list
        return head;
    }
}
