public class StackUsingLL {

    public Node top;

    public StackUsingLL() {
        this.top = null;
    }

    // push
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    // pop
    public int pop() {
        if (isEmpty()) {
            System.out.println("Linked List is Empty");
            return -1;
        } else {
            int data = top.data;
            top = top.next;
            return data;
        }
    }

    // peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("Linked List is Empty");
            return -1;
        } else {
            return top.data;
        }
    }

    // isEmpty
    public boolean isEmpty() {
        return top == null;
    }

    // display
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        } else {
            Node temp = top;
            while (temp != null) {
                System.out.print(temp.data + "\t");
                temp = temp.next;
            }
            System.out.println();
        } 
    }
}
