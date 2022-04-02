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
    public ListNode reverseList(ListNode head , int  k ){
        
        ListNode prev=null;
        ListNode next=null;
        ListNode cur = head;
        
        while(k>0)
        {
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
            k--;
        }
        
        
        return prev;
    }
    
    public ListNode reverseKGroup(ListNode head, int k) {
        
        ListNode newHead= null;
        ListNode cur= head;
        ListNode ktail=null;
        
        while(cur!=null)
        {
            int count =0;
            cur=head;
            while(count<k && cur!=null)
            {
                cur=cur.next;
                count+=1;
            }
            
            if(count==k)
            {
                
               ListNode revHead = reverseList(head,k);
                    
               if(newHead==null)
                newHead=revHead;
                
                if(ktail!=null)
                    ktail.next=revHead;
                
                ktail=head;  // first time assign to original head
                head=cur;
            }
            
            
            
            
        }
        if (ktail != null) // attach remaining nodes
            ktail.next = head;
        return newHead==null?head: newHead;
    }
}