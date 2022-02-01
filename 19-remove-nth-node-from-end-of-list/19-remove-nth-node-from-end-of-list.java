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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;
        
        if(head==null) return null;
        while(n>1)
        {
            fast=fast.next;
            n--;
        }
        
        while(fast.next!=null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next;
            
        }        
        if(prev!=null)
             prev.next=slow.next;
        else if(slow==head)
        {
            head=slow.next;
        }
        return head;
    }
}