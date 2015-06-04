import java.util.*;

public class Solution {
    class MinStack {
        Stack<Integer> minStack;
        Stack<Integer> stack;

        public MinStack() {
            stack = new Stack<Integer>();
            minStack = new Stack<Integer>();
        }

        public void push(int x) {
            stack.push(x);
            if (minStack.size() == 0) {
                minStack.push(x);
            } else {
                minStack.push(Math.min(minStack.peek(), x));
            }
        }

        public void pop() {
            if (stack.size() > 0) {
                stack.pop();
                minStack.pop();
            }
        }

        public int top() {
            if (stack.size() == 0) {
                return 0;
            }
            return stack.peek();
        }

        public int getMin() {
            if (minStack.size() == 0) {
                return 0;
            }
            return minStack.peek();
        }
    }
}
