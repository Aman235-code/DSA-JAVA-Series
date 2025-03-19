
import java.util.Scanner;

public class LinkedList {

    class Node{
        public int data;

        public Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }


    Node head = null;

    // insert at beginning
    public void insertAtBeginning(int item){

        Node newNode = new Node(item);

        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // insert at last
    public void insertAtLast(int item){
        Node newNode = new Node(item);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // insert at specific position
    public void insertAtPos(int item, int pos){
        Node newNode = new Node(item);
        if(pos < 0){
            System.out.println("Invalid position");
            return;
        }

        if(pos == 0){
            newNode.next = head;
            head =  newNode;
            return;
        }

        Node temp = head;
        int index=0;
        while(temp.next!=null){
            if(index == pos-1){
                break;
            }
            temp = temp.next;
            index++;
            
        }

        //insert
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteFromBeginning(){
        if(head == null){
            System.out.println("No Nodes to delete");
            return;
        }
        head = head.next;
    }

    public void deleteFromLast(){
        if(head == null){
            System.out.println("No Nodes to delete");
            return;
        }
        if(head.next== null){
            head = null;
            return;
        }
        Node temp = head;

       
        while (temp.next.next!=null) {
            temp=temp.next;
        }
        temp.next=null;
    }

    public void deleteFromPos(int pos){
        if(head == null){
            System.out.println("No Nodes to delete");
            return;
        }
        if(pos < 0){
            System.out.println("Invalid position");
            return;
        }

        if(pos == 0){
            head = head.next;
            return;
        }
        // 0x35 0x36 0x37 0x38  0x39
        Node temp = head;
        
        for(int i=0;i<pos && temp!= null;i++){
            temp = temp.next;
        }

        if(temp == null || temp.next == null){
            System.out.println("Position is out of bound!");
            return;
        }
        temp.next = temp.next.next;
    }

    public boolean searchData(int data){
        Node temp = head;
        while(temp!=null){
            if(temp.data == data){
                return true;
            } 
            temp = temp.next;
        }
        return false;
    }

    public void printData(){
        Node temp = head;
        if(temp== null){
            System.out.println("Empty linked list");
            return;
        }
        while(temp!=null){
            if(temp.next==null){
                System.out.print(temp.data);
            }
            else{
                System.out.print(temp.data + " => ");
            }
            temp = temp.next;
        }
    }

    public static void printMenu(){
        System.out.println("--------MENU---------");
        System.out.println("Enter 1 to Insert");
        System.out.println("Enter 2 to delete");
        System.out.println("Enter 3 to search");
        System.out.println("Enter 4 to display");
        System.out.println("Enter 5 to exit");
        System.out.println("Enter your choice");
        System.out.println("-----------------------");
    }

    public static void printInsertMenu(){
        System.out.println("Press 1 to insert from head");
        System.out.println("Press 2 to insert from tail");
        System.out.println("Press 3 to insert at specific position");
    }

    public static void printDeleteMenu(){
        System.out.println("Press 1 to delete from head");
        System.out.println("Press 2 to delete from tail");
        System.out.println("Press 3 to delete at specific position");
    }

    public static void deleteDataFromLinkedList(LinkedList linkedList){
        printDeleteMenu();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter delete choice");
        int deleteChoice = s.nextInt();
        if(deleteChoice == 1){
            linkedList.deleteFromBeginning();
        }
        else if(deleteChoice == 2){
            linkedList.deleteFromLast();
        }
        else if(deleteChoice == 3){
            System.out.println("Enter the position :");
            int pos = s.nextInt();
            linkedList.deleteFromPos(pos);
        }
        else{
            System.out.println("Inavlid choice");
        }
    }

    public static void insertLinkedList(LinkedList linkedList){
        printInsertMenu();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter insert choice");
        int interChoice = s.nextInt();
        if(interChoice == 1){
            System.out.println("Enter your data: ");
            int data = s.nextInt();
            linkedList.insertAtBeginning(data);
        }
        else if(interChoice == 2){
            System.out.println("Enter your data: ");
            int data = s.nextInt();
            linkedList.insertAtLast(data);
        }
        else if(interChoice == 3){
            System.out.println("Enter your data: ");
            int data = s.nextInt();
            System.out.println("Enter the position :");
            int pos = s.nextInt();
            linkedList.insertAtPos(data,pos);
        }
        else{
            System.out.println("Inavlid choice");
        }
    }

    public static void main(String[] args) {
      
        System.out.println("-------Welcome-------");
        Scanner sc = new Scanner(System.in);
        LinkedList linkedList= new LinkedList();
        while (true) { 
            try {
                printMenu();
                int choice = sc.nextInt();
                if(choice ==1){
                    insertLinkedList(linkedList);
                }


                else if(choice == 2){      
                    deleteDataFromLinkedList(linkedList);
                } 
                
                else if(choice == 3){
                    System.out.println("Enter the data you want to search");
                    int data = sc.nextInt();
                    boolean res = linkedList.searchData(data);
                    if(res){
                        System.out.println("Yes, data is present in list");
                    }
                    else{
                        System.out.println("Data is not present in list");
                    }
                }
                else if(choice == 4){
                    linkedList.printData();
                }
                
                else if(choice == 5){
                    System.out.println("Thank you");
                    break;
                }


                else{
                    System.out.println("Inavlid choice");
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
