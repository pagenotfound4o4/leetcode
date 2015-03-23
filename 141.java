import java.util.*;

public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null) {
            slow = slow.next;
            if (fast.next.next == null) return false;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }
}
