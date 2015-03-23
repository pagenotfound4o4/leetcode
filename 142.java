import java.util.*;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode slow = head, fast = head;
        int slowVal = 0, fastVal = 0;
        do {
            for (int i=0; i<2; i++) {
                fast = fast.next;
                if (fast == null) return null;
            }
            slow = slow.next;
            slowVal++;
            fastVal += 2;
        } while (fast != slow);
        int cnt = fastVal - slowVal;
        fast = slow = head;
        for (int i=0; i<cnt; i++) {
            fast = fast.next;
        }
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
