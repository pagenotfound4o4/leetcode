import java.util.*;

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int value = (l1.val + l2.val) % 10;
        int p = (l1.val + l2.val) / 10;
        ListNode root = new ListNode(value);
        ListNode cur = root;
        while (l1.next != null && l2.next != null) {
            l1 = l1.next;
            l2 = l2.next;
            value = (l1.val + l2.val + p) % 10;
            p = (l1.val + l2.val + p) / 10;
            cur.next = new ListNode(value);
            cur = cur.next;
        }
        while (l1.next != null) {
            l1 = l1.next;
            value = (l1.val + p) % 10;
            p = (l1.val + p) / 10;
            cur.next = new ListNode(value);
            cur = cur.next;
        }
        while (l2.next != null) {
            l2 = l2.next;
            value = (l2.val + p) % 10;
            p = (l2.val + p) / 10;
            cur.next = new ListNode(value);
            cur = cur.next;
        }
        if (p > 0) {
            cur.next = new ListNode(p);
        }
        return root;
    }
}
