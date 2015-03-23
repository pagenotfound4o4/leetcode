import java.util.*;

public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode cur = head;
        ListNode nhead = new ListNode(0);
        ListNode thead = new ListNode(0);
        ListNode tcur = thead, last = nhead;
        int cnt = 0;
        while (cur != null) {
            cnt++;
            tcur.next = cur;
            tcur = tcur.next;
            cur = cur.next;
            if (cnt == k) {
                tcur.next = null;
                thead.next = reverse(thead.next);
                last.next = thead.next;
                while (last.next != null) last = last.next;
                thead = new ListNode(0);
                tcur = thead;
                cnt = 0;
            }
        }
        last.next = thead.next;
        return nhead.next;
    }

    public ListNode reverse(ListNode head) {
        ListNode nhead = new ListNode(0);
        ListNode cur = head;
        while (cur != null) {
            ListNode tmp = cur.next;
            cur.next = nhead.next;
            nhead.next = cur;
            cur = tmp;
        }
        return nhead.next;
    }
}
