public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0) return new int[0];
        Deque<Integer> deque = new LinkedList<>();
        int n = nums.length;
        int[] res = new int[n-k+1];
        int pos = 0;
        for (int i=0; i<n; i++) {
            // remove out of window items, from head to tail
            while (!deque.isEmpty() && deque.peekFirst()+k<=i) deque.pollFirst();
            // remove items in deque that smaller than current item, from tail to head
            while (!deque.isEmpty() && nums[deque.peekLast()]<nums[i]) deque.pollLast();
            deque.addLast(i);
            if (i >= k-1) res[pos++] = nums[deque.peekFirst()];
        }
        return res;
    }
}
