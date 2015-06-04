import java.util.*;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode nhead = new ListNode(0);
        ListNode tail = nhead;
        ListNode slow = head, fast = head;
        int cnt = 0;
        while (fast != null) {
            if (fast.val != slow.val) {
                if (cnt == 1) {
                    tail.next = slow;
                    tail = tail.next;
                }
                slow = fast;
                cnt = 0;
            } else {
                cnt++;
                fast = fast.next;
            }
        }
        if (slow.next == null) {
            tail.next = slow;
            tail = tail.next;
        }
        tail.next = null;
        return nhead.next;
    }
}
