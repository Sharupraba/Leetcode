// Last updated: 2/13/2026, 9:48:00 AM
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
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;//
        ListNode temp=head;
        while(temp!=null){
           ListNode x= temp.next;// x is created to store the changing temp.next value orelse it will be deleted
	         temp.next= prev;//lets assume temp is a value and temp.next is address part .in address part the "prev" is a pointer ,the value thats present in prev is stored in temp.next .simply the address is reversed
	         prev=temp;
	         temp=x;
	     }
	      head =prev;//at last prev stores the head value 
          return prev;
	 }
}
        