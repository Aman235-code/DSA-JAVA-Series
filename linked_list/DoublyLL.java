public class DoublyLL {
    public class Node{

        public int data;

        public Node prev;

        public Node next;

        public Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    // add data from front 
    public void addFront(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
        }

        else{
            
            newNode.next = head; 
            head.prev = newNode;
            head = newNode;
        }
    }

     // add data to rear
    public void addEnd(int data){
        Node newNode = new Node(data);

        if(tail == null){
            head = newNode;
            tail = newNode;
        }

        else{
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    // delete front 
    public void deleteFront(){
        if(head == null){
            System.out.println("Empty LL");
            return;
        }
        if(head.next == null){
            head = null;
            tail = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }

    public void deleteEnd(){
        if(tail == null){
            System.out.println("Empty LL");
            return;
        }
        if(tail.prev == null){
            head = tail=null;
        }
        else{
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void diplayBackward(){
        Node current = tail;
        while(current!= null){
            System.out.print(current.data + "\t");
            current = current.prev;

        }
        System.out.println();
    }

    public void displayForward(){
        Node current = head;
        while(current!= null){
            System.out.print(current.data + "\t");
            current = current.next;
        }
        System.out.println();
    } 
}
