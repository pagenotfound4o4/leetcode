/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode slow = head, fast = head, prev = slow;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        ListNode heada = sortList(head);
        ListNode headb = sortList(slow);
        return merge(heada, headb);
    }

    public ListNode merge(ListNode heada, ListNode headb) {
        ListNode nhead = new ListNode(0);
        ListNode cur = nhead;
        while (heada != null && headb != null) {
            if (heada.val < headb.val) {
                cur.next = heada;
                heada = heada.next;
            } else {
                cur.next = headb;
                headb = headb.next;
            }
            cur = cur.next;
        }
        if (heada != null) cur.next = heada;
        if (headb != null) cur.next = headb;
        return nhead.next;
    }
}
