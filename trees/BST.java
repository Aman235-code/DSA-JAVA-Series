public class BST {
    Node root;

    public BST() {
        this.root = null;
    }

    // insert
    private Node insert(Node root, int data) {
        if (root == null) {
            Node node = new Node(data);
            return node;
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public void insert(int data) {
        root = this.insert(root, data);
    }

    public Node findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    private Node delete(Node root, int data) {
        if (root == null) {
            return root;
        }
        if (data < root.data) {
            root.left = delete(root.left, data);
        } else if (data > root.data) {
            root.right = delete(root.right, data);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            }
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                Node successor = findMin(root.right);
                root.data = successor.data;
                root.right = delete(root.right, successor.data);
            }

        }
        return root;
    }

    // delete
    public void delete(int data) {
        root = this.delete(root, data);
    }

    // search
    private boolean search(Node root, int data) {
        if (root == null) {
            return false;
        }
        if (root.data == data) {
            return true;
        }

        if (data < root.data) {
            return search(root.left, data);
        } else {
            return search(root.right, data);
        }
    }

    public boolean search(int data) {
        return search(root, data);
    }

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
