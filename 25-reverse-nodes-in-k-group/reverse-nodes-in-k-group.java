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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr=head;
        int c=0;
        while(curr!=null && c!=k){
            curr=curr.next;
            c++;
        }
        if(c==k){
            curr=reverseKGroup(curr,k);
            while(c-- >0){
                ListNode temp=head.next;
                head.next=curr;
                curr=head;
                head=temp;
            }
            head=curr;
        }
        return head;
    }
}