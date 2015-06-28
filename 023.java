/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        Queue<ListNode> queue = new LinkedList<ListNode>();
        for (ListNode node : lists) {
            queue.add(node);
        }
        while (queue.size() > 1) {
            ListNode heada = queue.poll();
            ListNode headb = queue.poll();
            queue.add(merge(heada, headb));
        }
        return queue.poll();
    }

    public ListNode merge(ListNode heada, ListNode headb) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while (heada!=null && headb!=null) {
            if (heada.val < headb.val) {
                cur.next = heada;
                heada = heada.next;
            } else {
                cur.next = headb;
                headb = headb.next;
            }
            cur = cur.next;
        }
        if (heada != null) {
            cur.next = heada;
        } else if (headb != null) {
            cur.next = headb;
        }
        return head.next;
    }
}
