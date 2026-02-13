// Last updated: 2/13/2026, 9:47:54 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
       
        node.val=node.next.val;//  value is replaced
        node.next=node.next.next;// address is replaced
    }
}