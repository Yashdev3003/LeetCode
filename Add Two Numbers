/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode it1=l1;
        ListNode it2=l2;
        boolean overflow=false;
        ListNode l3=new ListNode(0);
        ListNode head=l3;
        
        while(it1!=null || it2!=null) {
            int d1=(it1==null)?0:it1.val;
            int d2=(it2==null)?0:it2.val;
            int carry=overflow==true?1:0;
            int sum=d1+d2+carry;
            if(sum>9) {
                overflow=true;
            } else {
                overflow=false;
            }
            l3.next=new ListNode(sum%10);
            l3=l3.next;
            it1=it1==null?null:it1.next;
            it2=it2==null?null:it2.next;
        }
        
        if(overflow) {
            int over=(overflow==false)?0:1;
            l3.next=new ListNode(over);
        }
        return head.next;
    }
}
