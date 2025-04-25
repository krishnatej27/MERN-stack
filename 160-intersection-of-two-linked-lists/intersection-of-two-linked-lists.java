/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int al=0,bl=0;
        ListNode ta=headA;
        ListNode tb=headB;
        while(ta!=null){
            ta=ta.next;
            al++;
        }
        while(tb!=null){
            tb=tb.next;
            bl++;
        }
        ta=headA;
        tb=headB;
        if(al>bl){
            int d=al-bl;
            while(d-- >0){
                ta=ta.next;
            }
        }
        else{
            int d=bl-al;
            while(d-- >0){
                tb=tb.next;
            }
        }
        while(ta!=null && tb!=null){
            if(ta==tb) {
                return ta;
            }
            ta=ta.next;
            tb=tb.next;
        }
        return null;
    }
}