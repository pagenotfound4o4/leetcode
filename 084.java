public class Solution {
    public int largestRectangleArea(int[] height) {
        if (height == null || height.length == 0) return 0;
        Stack<Integer> stack = new Stack<Integer>();
        int pos = 0;
        int maxv = 0;
        while (pos < height.length) {
            if (stack.isEmpty() || height[stack.peek()] <= height[pos]) {
                stack.push(pos);
                pos++;
            } else {
                int idx = stack.pop();
                int cur = 0;
                if (stack.isEmpty()) cur = height[idx] * pos;
                else cur = height[idx] * (pos - stack.peek() - 1);
                maxv = Math.max(maxv, cur);
            }
        }
        while (!stack.isEmpty()) {
            int idx = stack.pop();
            int cur = 0;
            if (stack.isEmpty()) cur = height[idx] * pos;
            else cur = height[idx] * (height.length - stack.peek() - 1);
            maxv = Math.max(maxv, cur);
        }
        return maxv;
    }
}
