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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> hp= new PriorityQueue<>();
        
        for(ListNode node : lists){
             ListNode head = node;
            while(head!=null)
            {
                 hp.add(head.val);
                head=head.next;
            }
                
        }
        ListNode head= new ListNode(-1);
        ListNode cur = head;
       
        while(!hp.isEmpty())
        {
            cur.next=(new ListNode(hp.poll()));
            cur=cur.next;
        }
        
        
        
        return head.next;
    }
}