import java.util.*;

public class Solution {
    public ListNode insertionSortList(ListNode head) {
        if (head == null) return null;
        ListNode cur = head.next;
        head.next = null;
        while (cur != null) {
            ListNode pcur = head;
            if (cur.val < head.val) {
                ListNode tmp = cur.next;
                cur.next = head;
                head = cur;
                cur = tmp;
            } else {
                while (pcur.next != null && pcur.next.val < cur.val) {
                    pcur = pcur.next;
                }
                ListNode tmp = pcur.next;
                pcur.next = cur;
                cur = cur.next;
                pcur.next.next = tmp;
            }
        }
        return head;
    }
}
