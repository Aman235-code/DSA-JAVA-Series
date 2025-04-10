public class CircularQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public CircularQueue(int capacity) {
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.capacity = capacity;
    }

    public void enque(int data) {
        if (size == capacity) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = data;
        size++;
    }

    public int deque() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int data = queue[front];
        front = (front + 1) % capacity;
        size--;
        return data;
    }

    public int size() {
        return this.size;
    }

    public void display() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = 0; i < size; i++) {
            int data = queue[(front + i) % capacity];
            System.out.print(data + "\t");
        }
    }
}
