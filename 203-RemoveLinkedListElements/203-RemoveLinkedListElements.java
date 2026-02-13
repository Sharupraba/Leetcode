// Last updated: 2/13/2026, 9:48:02 AM
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
    public ListNode removeElements(ListNode head, int val) {
        ListNode last = new ListNode();
        ListNode prev = last;

        while (head != null) {
            if (head.val != val) {
                prev.next = new ListNode(head.val);
                prev = prev.next;
            }

            head = head.next;
        }

        return last.next;
    }
}