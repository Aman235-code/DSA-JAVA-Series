public class StackQueue {
    private Stack stack1;
    private Stack stack2;
    private int size;

    public StackQueue(int size) {
        this.size = size;
        this.stack1 = new Stack(this.size);
        this.stack2 = new Stack(this.size);
    }

    public void enqueue(int data) {
        this.stack1.push(data);
    }

    public int deque() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            return stack2.pop();
        }

    }

    public int peek() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
        StackQueue stackQueue = new StackQueue(3);
        stackQueue.enqueue(20);
        stackQueue.enqueue(10);
        System.out.println(stackQueue.deque());
    }
}