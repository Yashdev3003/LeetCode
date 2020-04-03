/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        ListNode p=head;
        ListNode q=null;
        int count=0;
        while(temp!=null) {
            count++;
            temp=temp.next;
        }
        int index=(count-n);
        if(index==0) {
            return head.next;
        }
        int i=0;
        while(i<=index) {
            if(i==index) {
                p=p.next;
                break;
            } else {
                q=p;
                p=p.next;
                i++;
            }
        }
        q.next=p;
        
        return head;
    }
}
