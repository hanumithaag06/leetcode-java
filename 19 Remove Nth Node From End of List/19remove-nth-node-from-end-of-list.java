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
        if(head==null){
            return null;
        }

        int count=1;
        ListNode temp=head;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }
        int m=count-n;
        if(m==0){
            return head.next;
        }
        ListNode curr=head;
        ListNode prev=null;

        for(int i=0; i<m; i++){
            prev=curr;
            curr=curr.next;
        }
        prev.next=curr.next;
        return head;
    }
}