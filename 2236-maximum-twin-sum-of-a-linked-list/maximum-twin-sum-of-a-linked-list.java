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
    private ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode temp=head;
        int c=0;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            c++;
        }
        ListNode rev=reverse(slow);
        ListNode revh=rev;
        int m=0;
        while(revh!=null){
            m=Math.max(temp.val+revh.val,m);
            revh=revh.next;
            temp=temp.next;
        }
        return m;
    }
}