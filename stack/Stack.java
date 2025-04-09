public class Stack {

    private int[] array;

    private int maxSize;

    private int top;

    public Stack(int size) {

        this.maxSize = size;
        this.array = new int[maxSize];
        this.top = -1;

    }

    // push
    public void push(int data) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full");
            return;
        } else {
            top++;
            array[top] = data;
        }
    }

    // pop
    public int pop() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        } else {
            int popElem = array[top];
            top--;
            return popElem;
        }
    }

    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }

    // peek
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        } else {
            return array[top];
        }
    }

    // display
    public void displayElements() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }
}