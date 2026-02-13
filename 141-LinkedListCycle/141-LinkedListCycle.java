// Last updated: 2/13/2026, 9:48:16 AM
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow= head;// indicates first elemnt at x 
        ListNode fast= head;// indiactes first elelmet at y
        while(fast!=null&& fast.next!=null){
        slow=slow.next;//  jumps one step at time
        fast=fast.next.next;// jumps two steps at a time
        if(slow==fast)// at one point the element in slow and fast intersects and that it shows that its circular linked list
        return true;}
         return false;// while loop comes out and return false when it becomes null i.e linear
        // if it does not meet then it returns false then its linear
    }
}