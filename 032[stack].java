public class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        int start = -1;
        char[] str = s.toCharArray();
        int maxlen = 0;
        for (int i=0; i<str.length; i++) {
            if (str[i] == '(') {
                stack.push(i);
            } else {
                if (!stack.isEmpty()) {
                    stack.pop();
                    if (stack.isEmpty()) {
                        maxlen = Math.max(maxlen, i - start);
                    } else {
                        maxlen = Math.max(maxlen, i - stack.peek());
                    }

                } else {
                    start = i;
                }
            }
        }
        return maxlen;
    }
}
