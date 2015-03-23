import java.util.*;

public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode nhead = new ListNode(0);
        nhead.next = head;
        ListNode prev = nhead;
        for (int i=0; i<m-1; i++) prev = prev.next;
        ListNode cur = prev.next;
        ListNode last = prev.next;
        for (int i=0; i<n-m+1; i++) {
            ListNode next = cur.next;
            cur.next = prev.next;
            prev.next = cur;
            cur = last.next = next;
        }
        return nhead.next;
    }
}
