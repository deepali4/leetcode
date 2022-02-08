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
    public ListNode swapPairs(ListNode head) {
        
        ListNode dummy  = new ListNode();
        
        if(head==null|| head.next==null) return head;
    
        ListNode pre = dummy ;
        ListNode next = null;
        ListNode cur = head;
        
        while(cur!=null && cur.next!=null)
        {
            next= cur.next;
            pre.next=next;
            cur.next=next.next;
            next.next=cur;
            pre=cur;
            cur=cur.next;
              
            
        }
        
        
        return dummy.next;
        
        
    }
}