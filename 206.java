import java.util.*;

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode nhead = new ListNode(0);
        while (head != null) {
            ListNode cur = head;
            head = head.next;
            cur.next = nhead.next;
            nhead.next = cur;
        }
        return nhead.next;
    }
}
