import java.util.*;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        int lenA = getListLen(headA);
        int lenB = getListLen(headB);
        ListNode curA = headA, curB = headB;
        if (lenA > lenB) {
            for (int i=0; i<lenA-lenB; i++) {
                curA = curA.next;
            }
        } else {
            for (int i=0; i<lenB-lenA; i++) {
                curB = curB.next;
            }
        }
        while (curA != null && curB != null && curA != curB) {
            curA = curA.next;
            curB = curB.next;
        }
        return curA;
    }

    public int getListLen(ListNode head) {
        int len = 0;
        ListNode cur = head;
        while (cur != null) {
            cur = cur.next;
            len++;
        }
        return len;
    }
}
