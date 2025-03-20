
class Main{
    public static void main(String[] args){
    //    Scanner sc =  new Scanner();
    //    String str = new String();
    //    System.out.println(str.isBlank());

    Node node1 = new Node(34);
    System.out.println(node1.data);
    System.out.println(node1.next);

    Node node2 = new Node(33);
    
    node1.next = node2;
    System.out.println(node1.next.data);

    Node node3 = new Node(66);
    node2.next = node3;
    System.out.println(node2.next.data);

    // call by value
    // int x = 45;
    // int y= x;
    // System.out.println(x);
    // System.out.println(y);
    // y= 90;
    // System.out.println(x);
    // System.out.println(y);

    // call by reference
    Node node4 = new Node(78);
    Node node5 = node4;
    System.out.println(node4.data);
    System.out.println(node5.data);
    node5.data = 90;
    System.out.println(node4.data);
    System.out.println(node5.data);


    }
}