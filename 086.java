import java.util.*;

public class Solution {
    public ListNode partition(ListNode head, int x) {
        if (head == null) return null;
        ListNode lhead = new ListNode(0);
        ListNode rhead = new ListNode(0);
        ListNode cl = lhead, cr = rhead, cur = head;
        while (cur != null) {
            if (cur.val < x) {
                cl.next = cur;
                cl = cl.next;
            } else {
                cr.next = cur;
                cr = cr.next;
            }
            cur = cur.next;
        }
        cl.next = rhead.next;
        cr.next = null;
        return lhead.next;
    }
}
