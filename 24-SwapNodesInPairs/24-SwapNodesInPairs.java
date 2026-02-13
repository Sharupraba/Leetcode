// Last updated: 2/13/2026, 10:11:44 AM
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
    public ListNode swapPairs(ListNode head) {
        ListNode temp = new ListNode(0); 
        temp.next = head;

        for (ListNode ptr = temp; ptr.next != null && ptr.next.next != null; ptr = ptr.next.next) {
            ListNode first = ptr.next;         
            ListNode second = ptr.next.next;   

            
            first.next = second.next;
            second.next = first;
            ptr.next = second;
        }

        return temp.next; // return new head
    }
}
