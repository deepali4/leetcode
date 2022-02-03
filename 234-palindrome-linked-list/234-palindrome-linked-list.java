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
    public boolean isPalindrome(ListNode head) {
        
        if(head==null) return true;
        
        // Find the end of first half and reverse second half.
        ListNode firstHalfEnd= findMiddel(head) ;
        ListNode secondHalfStart=reverse(firstHalfEnd.next);
        
        
         // Check whether or not there is a palindrome.
        ListNode p1=head;
        ListNode p2= secondHalfStart;
        boolean ans= true;
        while(ans && p2!=null)
        {   
            if(p1.val!=p2.val)ans=false;
            p1=p1.next;
            p2=p2.next;
        }
        
        // restore original list
        firstHalfEnd.next=reverse(secondHalfStart);
        return ans;
        
        
    }
    
    public ListNode reverse(ListNode head)
    {
        
        ListNode prev=null;
        ListNode cur=head;
        ListNode nxt=null;
        
        while(cur!= null){
            
            nxt=cur.next;
            cur.next=prev;
            prev=cur;
            cur=nxt;
        }
        
        return prev;
    }
    
    public ListNode findMiddel(ListNode head){
        ListNode slow= head;
        ListNode fast= head;
        
        while(fast.next!=null && fast.next.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        
        
        return slow;
    }
}