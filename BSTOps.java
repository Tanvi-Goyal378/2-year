class BSTOps {

    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    Node root;

    Node insert(Node root, int key) {
        if (root == null) return new Node(key);

        if (key < root.data)
            root.left = insert(root.left, key);
        else
            root.right = insert(root.right, key);

        return root;
    }

    Node minValue(Node root) {
        while (root.left != null)
            root = root.left;
        return root;
    }

    Node delete(Node root, int key) {
        if (root == null) return null;

        if (key < root.data)
            root.left = delete(root.left, key);
        else if (key > root.data)
            root.right = delete(root.right, key);
        else {
            // case: 2 children
            Node temp = minValue(root.right);
            root.data = temp.data;
            root.right = delete(root.right, temp.data);
        }
        return root;
    }

    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        BSTOps tree = new BSTOps();
        int[] arr = {15, 10, 20, 8, 12, 17, 25};

        for (int x : arr)
            tree.root = tree.insert(tree.root, x);

        // Delete 10
        tree.root = tree.delete(tree.root, 10);

        // Insert 14
        tree.root = tree.insert(tree.root, 14);

        // Insert 9
        tree.root = tree.insert(tree.root, 9);

        System.out.print("Final Tree (Inorder): ");
        tree.inorder(tree.root);
    }
}