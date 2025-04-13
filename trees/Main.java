public class Main {
    public static void main(String[] args) {

        Node root = new Node(1);
        Node left = new Node(2);
        Node right = new Node(3);

        BinaryTree binaryTree = new BinaryTree(root);
        binaryTree.root.left = left;
        binaryTree.root.right = right;

        Node node4 = new Node(4);
        Node node5 = new Node(5);
        binaryTree.root.left.left = node4;
        binaryTree.root.left.right = node5;
        Node node6 = new Node(6);
        binaryTree.root.right.right = node6;

        // traversal
        // pre
        binaryTree.preorder(binaryTree.root);
        System.out.println();
        binaryTree.inorder(binaryTree.root);
        System.out.println();
        binaryTree.postorder(binaryTree.root);
    }
}