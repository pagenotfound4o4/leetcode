import java.util.*;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode first = head;
        ListNode nhead = new ListNode(0);
        ListNode last = nhead;
        while (first != null) {
            ListNode second = first.next;
            if (second != null) {
                ListNode tmp = second.next;
                last.next = second;
                second.next = first;
                last = first;
                first = tmp;
            } else {
                last.next = first;
                last = first;
                break;
            }
        }
        last.next = null;
        return nhead.next;
    }
}
