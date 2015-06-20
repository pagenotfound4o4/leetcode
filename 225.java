class MyStack {
    private Queue<Integer> first;
    private Queue<Integer> second;
    
    public MyStack() {
        first = new LinkedList<Integer>();
        second = new LinkedList<Integer>();
    }
    
    // Push element x onto stack.
    public void push(int x) {
        first.offer(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
        while (first.size() > 1) {
            second.offer(first.poll());
        }
        first = second;
        second = new LinkedList<Integer>();
    }

    // Get the top element.
    public int top() {
        int x = 0;
        while (first.size() > 1) {
            second.offer(first.poll());
        }
        x = first.poll();
        second.offer(x);
        first = second;
        second = new LinkedList<Integer>();
        return x;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return first.isEmpty();
    }
}