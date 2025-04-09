public class StackLinkMain {
    public static void main(String[] args) {
        StackUsingLL stackUsingLL = new StackUsingLL();
        stackUsingLL.push(50);
        stackUsingLL.push(20);
        stackUsingLL.push(30);
        System.out.println(stackUsingLL.pop());
        System.out.println(stackUsingLL.peek());
        stackUsingLL.display();
    }
}
