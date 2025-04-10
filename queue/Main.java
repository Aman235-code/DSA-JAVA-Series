
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        // SimpleQueue simpleQueue = new SimpleQueue(5);
        // simpleQueue.enque(100);
        // simpleQueue.enque(200);
        // simpleQueue.enque(50);
        // // simpleQueue.display();

        // System.out.println(simpleQueue.deque());

        // simpleQueue.display();

        // CircularQueue circularQueue = new CircularQueue(5);
        // circularQueue.enque(10);
        // circularQueue.enque(20);
        // circularQueue.enque(6);
        // System.out.println(circularQueue.size());

        // circularQueue.enque(100);
        // circularQueue.enque(50);

        // circularQueue.display();
        // System.out.println(circularQueue.deque());
        // circularQueue.display();
        // circularQueue.enque(70);
        // // circularQueue.display();
        // System.out.println(circularQueue.deque());
        // circularQueue.display();

        Dequeue deque = new Dequeue(5);
        deque.insertRear(10);
        deque.insertRear(40);
        deque.insertFront(500);
        deque.insertFront(300);
        deque.insertRear(60);
        // System.out.println(deque.size());
        // deque.display();
        // deque.insertFront(800);
        // deque.insertRear(700);
        // System.out.println(deque.getFront());
        // System.out.println(deque.getRear());

        deque.deleteFront();
        deque.deleteRear();
        deque.display();

    }
}