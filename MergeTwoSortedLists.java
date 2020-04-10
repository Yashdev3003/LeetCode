/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class MergeTwoSortedLists {
    
    public int getSize(ListNode L) {
        int count=0;
        while(L!=null) {
            count++;
            L=L.next;
        }
        return count;
    }
    
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null && l2==null) {
            return null;
        } else if(l1==null) {
            return l2;
        } else if(l2==null) {
            return l1;
        }
        
        ListNode head=l1;
        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode temp3=l1;
        ListNode temp4=l1;
        ListNode temp6=l1;
        while(temp1.next!=null) {
            temp1=temp1.next;
        }
        temp1.next=temp2;
        int count=getSize(temp6);
        for(int i=0; i<count; i++) {
            for(int j=i; j<count; j++) {
                try {
                    if(temp3.val>temp4.val) {
                        int temp;
                        temp=temp3.val;
                        temp3.val=temp4.val;
                        temp4.val=temp;
                        temp4=temp4.next;
                    } else {
                        temp4=temp4.next;
                    }
                } catch(Exception e) {
                    
                }
            }
            temp3=temp3.next;
            temp4=temp3;
        }
        return head;
    }
}