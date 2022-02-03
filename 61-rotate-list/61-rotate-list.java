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
    public ListNode rotateRight(ListNode head, int k) {
        
        // base cases
        if (head == null) return null;
        if (head.next == null) return head;
        
         // close the linked list into the ring
        ListNode cur= head;
        int n=1;
        while(cur.next!=null)
        { cur=cur.next; n++;
        }
        
        
        cur.next=head;
        
        
        // find new tail : (n - k % n - 1)th node
        // and new head : (n - k % n)th node
        for(int i=0;i<(n-k%n-1);i++)
        {
            head=head.next;
        }
        
        ListNode newHead= head.next;
        
        // break the ring
        head.next=null;
        
        return newHead;
        
    }
}