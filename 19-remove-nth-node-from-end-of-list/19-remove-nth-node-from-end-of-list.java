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
        int size=0;
        ListNode root=head;
        while(root!=null)
        {
            size++;
            root=root.next;
        }
        int a=size-n;
        
        if(size==1)
        {
            head=null;
            return head;
        }
         ListNode prev=null;
        ListNode curr=head;
        
        root=head;
        if(a==0)
        {
            head=head.next;
            return head;
        }
        else
        {
        for(int i=0;i<=a;i++)
        {
             prev=curr;
            curr=curr.next;
            if(i==a-1)
            {
                prev.next=curr.next;
            }
           
        }
        }
        return head;
    }
}