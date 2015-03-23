import java.util.*;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode nhead = new ListNode(0);
        nhead.next = head;
        ListNode last = nhead, prev = nhead;
        for (int i=0; i<n; i++) {
            last = last.next;
        }
        while (last.next != null) {
            prev = prev.next;
            last = last.next;
        }
        prev.next = prev.next.next;
        return nhead.next;
    }
}
