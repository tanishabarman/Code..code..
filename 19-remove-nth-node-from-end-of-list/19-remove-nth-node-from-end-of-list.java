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
        
        ListNode t1 = head;
        ListNode t2 = head;
        while(n!=0){
            t2 = t2.next;          
            n--;
        }
        if(t2==null) return head.next;
        while(t2.next!=null){
            t2 = t2.next;
            t1=t1.next;   
        }
        t1.next = t1.next.next;
        return head;
        
    }
}