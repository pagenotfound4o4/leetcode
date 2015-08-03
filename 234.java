/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode slow = head, fast = head;
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
            if (fast == null) break;
            fast = fast.next;
        }
        ListNode nhead = new ListNode(0);
        while (slow != null) {
            ListNode cur = slow;
            slow = slow.next;
            cur.next = nhead.next;
            nhead.next = cur;
        }
        ListNode ca = head, cb = nhead.next;
        while (cb != null) {
            if (cb.val != ca.val) return false;
            ca = ca.next;
            cb = cb.next;
        }
        return true;
    }
}
