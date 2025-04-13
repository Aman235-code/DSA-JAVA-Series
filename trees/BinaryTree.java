public class BinaryTree {
    Node root;

    public BinaryTree(Node root) {
        this.root = root;
    }

    public BinaryTree() {
        this.root = null;
    }

    // dfs
    // preorder root>l>r
    public void preorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + "\t");
        preorder(node.left);
        preorder(node.right);
    }

    // inorder l>root>r
    public void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.data + "\t");
        inorder(node.right);
    }

    // post order left>r>root
    public void postorder(Node node) {
        if (node == null) {
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + "\t");
    }

}
