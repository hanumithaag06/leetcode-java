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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode sec = reverse(slow.next);
        slow.next = null;
        ListNode first = head;
        // ListNode dummy = new ListNode(0);
        // dummy.next = head;

        while(sec!=null){
            ListNode fnext = first.next;
            ListNode snext = sec.next;

            first.next = sec;
            sec.next = fnext;

            first = fnext;
            sec = snext; 
        }


        
    }
    public ListNode reverse(ListNode head){
        ListNode temp = head;
        ListNode prev = null;
        while(temp!=null){
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;          

        }
        return prev;
    }
}