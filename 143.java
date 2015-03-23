import java.util.*;

public class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        int cnt = 0;
        ListNode cur = head;
        while (cur != null) {
            cur = cur.next;
            cnt++;
        }
        ListNode small = head;
        cur = head;
        for (int i=0; i<cnt/2-1; i++) {
            cur = cur.next;
        }
        ListNode last = cur;
        cur = cur.next;
        last.next = null;

        //reorder large
        ListNode large = new ListNode(0);
        while (cur != null) {
            ListNode tmp = cur.next;
            cur.next = large.next;
            large.next = cur;
            cur = tmp;
        }
        large = large.next;

        //merge
        head = new ListNode(0);
        last = head;
        while (small != null && large != null) {
            last.next = small;
            small = small.next;
            last = last.next;
            last.next = large;
            large = large.next;
            last = last.next;
        }
        if (small != null) last.next = small;
        else if (large != null) last.next = large;
        head = head.next;
    }
}
