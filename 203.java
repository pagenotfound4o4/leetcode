import java.util.*;

public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode nhead = new ListNode(0);
        ListNode cur = nhead;
        while (head != null) {
            if (head.val != val) {
                cur.next = head;
                cur = cur.next;
            }
            head = head.next;
        }
        cur.next = null;
        return nhead.next;
    }
}
