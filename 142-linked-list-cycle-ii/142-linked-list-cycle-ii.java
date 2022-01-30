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
    
    public ListNode getintersect(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            
            if(fast==slow)
                return fast;
        }
        
        return null;
    }
    public ListNode detectCycle(ListNode head) {
        
        if(head==null)return null;
       
        ListNode itersect = getintersect(head);
        if(itersect==null)return null;
        ListNode fast=head;
        ListNode slow=itersect;
        
        while(slow!=fast)
        {
            slow=slow.next;
            fast=fast.next;
        }
            
        
       return fast; 
    }
}