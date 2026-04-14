class BST {
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

    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    boolean isValidBST(Node root, int min, int max) {
        if (root == null) return true;

        if (root.data <= min || root.data >= max)
            return false;

        return isValidBST(root.left, min, root.data) &&
               isValidBST(root.right, root.data, max);
    }

    public static void main(String[] args) {
        BST tree = new BST();
        int[] arr = {50, 30, 70, 20, 40, 60, 80, 10, 25};

        for (int x : arr)
            tree.root = tree.insert(tree.root, x);

        System.out.print("Inorder (Sorted): ");
        tree.inorder(tree.root);

        System.out.println("\nValid BST: " +
            tree.isValidBST(tree.root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
}