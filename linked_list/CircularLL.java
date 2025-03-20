public class CircularLL {

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

    Node head = null;;
    Node tail = null;

    

    // add front
    public void addFront(int data){
        // create new node 
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            head.next = head;
            head.prev = head;
            return;
        }
        newNode.next = head; 
        newNode.prev = tail; 
        head.prev = newNode;
        tail.next = newNode;

        head = newNode;
    }

    // add from back 
    public void addEnd(int data){
        Node newNode = new Node(data);
        if(tail == null){
            head = tail = newNode;
            head.next = head; 
            head.prev = head;
            return;
        }
        newNode.prev = tail;
        newNode.next = head;
        tail.next = newNode;
        head.prev = newNode;

        tail = newNode;
    }

    public void deleteFront(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head == tail){
            head = null; 
            tail = null;
            return;
        }
        head = head.next;
        head.prev = tail;
        tail.next = head;
    }

    public void deleteEnd(){
        if(tail == null){
            System.out.println("List is empty");
            return;
        }
        if(head == tail){
            head = null; 
            tail = null;
            return;
        }
        tail = tail.prev;
        tail.next = head; 
        head.prev = tail;
    }

    public void dispForward(){
        if(head == null){
            System.out.println("Empty list");
            return;
        }
        Node temp = head;
        do { 
            System.out.print(temp.data + "\t");
            temp = temp.next;
        } while (temp!=head);
        System.out.println();
    }

    public void dispBack(){
        if(tail == null){
            System.out.println("Empty list");
            return;
        }
        Node temp = tail;
        do { 
            System.out.print(temp.data + "\t");
            temp = temp.prev;
        } while (temp!=tail);
        System.out.println();
    }
    
    
}
