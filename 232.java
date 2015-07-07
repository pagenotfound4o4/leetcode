class MyQueue {
    Stack<Integer> stack = new Stack<Integer>();
    int front = 0;

    // Push element x to the back of queue.
    public void push(int x) {
        if (stack.empty()) {
            front = x;
        }
        stack.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        Stack<Integer> tstack = new Stack<Integer>();
        while (!stack.empty()) {
            tstack.push(stack.pop());
        }
        tstack.pop();
        front = tstack.empty() ? 0 : tstack.peek();
        while (!tstack.empty()) {
            stack.push(tstack.pop());
        }
    }

    // Get the front element.
    public int peek() {
        return front;
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stack.empty();
    }
}
