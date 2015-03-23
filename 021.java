import java.util.*;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        ListNode pl1 = l1, pl2 = l2;
        while (pl1 != null && pl2 != null) {
            if (pl1.val < pl2.val) {
                cur.next = pl1;
                pl1 = pl1.next;
            } else {
                cur.next = pl2;
                pl2 = pl2.next;
            }
            cur = cur.next;
        }
        while (pl1 != null) {
            cur.next = pl1;
            cur = cur.next;
            pl1 = pl1.next;
        }
        while (pl2 != null) {
            cur.next = pl2;
            cur = cur.next;
            pl2 = pl2.next;
        }
        return head.next;
    }
}
