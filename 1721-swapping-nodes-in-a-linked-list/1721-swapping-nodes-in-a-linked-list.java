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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode ptr1=head;
        ListNode ptr2=head;
        ListNode ptr3=head;
        if(head==null)
            return head;
        
        while(k>1)
        {
            ptr3=ptr3.next;
            ptr1=ptr1.next;
            k--;
        }
        while(ptr1!=null&&ptr1.next!=null)
        {
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
        int value=ptr3.val;
        ptr3.val=ptr2.val;
        ptr2.val=value;
        
        
        
       return head; 
    }

}