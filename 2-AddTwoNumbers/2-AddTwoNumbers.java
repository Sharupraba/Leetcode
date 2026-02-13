// Last updated: 2/13/2026, 10:11:52 AM
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp= new ListNode(-1);// creating a dummy first element as 1
        ListNode newtemp=temp;//it denotes the value in temp
        int carry=0;
        while(l1!=null|| l2!=null|| carry!=0){
            int x=(l1 == null)?0:l1.val;// x denotes value present in l1 ,if its null then val is entered as 0 orelse the numb val is added to l1 
            int y=(l2==null)?0:l2.val;// same for l2
            int sum=x+y+carry;
             newtemp.next=new ListNode(sum%10);// here new node is created with the last digit of the sum.it gives last digit if two digit numb & parameter is passed as sum%10
             carry=sum/10;// first digit of the two digit number is returned and it denotes carry
             newtemp=newtemp.next;// moved to next ne node
             if(l1!=null) l1=l1.next;// we have to move to next node only if l1 not equal to null
             if(l2!=null) l2=l2.next;
            
        }
        return temp.next;// the value present after the  dummy value what (-1)we have created is retured
    }
}