// Last updated: 2/13/2026, 9:47:23 AM
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
    public ListNode middleNode(ListNode head) {
        ListNode t1=head;
         ListNode t2=head;
         while(t2!=null && t2.next!=null){
            t1=t1.next;//jumps one step
            t2=t2.next.next;//jumps two step

         }
         return t1;
        
        }
        

        }
        
    