import java.util.*;

public class Solution {
    public ListNode rotateRight(ListNode head, int n) {
        if (head == null) return null;
        int cnt = 1;
        ListNode fast = head, slow = head;
        while (fast.next != null) {
            cnt++;
            fast = fast.next;
        }
        n %= cnt;
        for (int i=cnt-n-1; i>0; i--) {
            slow = slow.next;
        }
        fast.next = head;
        ListNode nhead = slow.next;
        slow.next = null;
        return nhead;
    }
}
