public class MainBST {
    public static void main(String[] args) {
        // insert
        BST bst = new BST();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(80);

        // System.out.println("Inorder traversal");
        // bst.inorder(bst.root);

        // System.out.println("Preordr traversal");
        // bst.preorder(bst.root);

        // System.out.println("Postordr traversal");
        // bst.postorder(bst.root);

        // delete

        bst.delete(80);
        bst.preorder(bst.root);

        // search
        System.out.println(bst.search(32));

        // traversal
    }
}
