class TreeNode {
    String data;
    TreeNode left, right;

    TreeNode(String data) {
        this.data = data;
        left = right = null;
    }
}

public class OrgTree {

    // Height of tree
    static int height(TreeNode root) {
        if (root == null) return -1;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    // Depth of a node
    static int depth(TreeNode root, String target, int d) {
        if (root == null) return -1;
        if (root.data.equals(target)) return d;

        int left = depth(root.left, target, d + 1);
        if (left != -1) return left;

        return depth(root.right, target, d + 1);
    }

    // Print ancestors
    static boolean printAncestors(TreeNode root, String target) {
        if (root == null) return false;

        if (root.data.equals(target)) return true;

        if (printAncestors(root.left, target) ||
            printAncestors(root.right, target)) {
            System.out.print(root.data + " ");
            return true;
        }
        return false;
    }

    // Count degree
    static int degree(TreeNode node) {
        int count = 0;
        if (node.left != null) count++;
        if (node.right != null) count++;
        return count;
    }

    public static void main(String[] args) {
        TreeNode CEO = new TreeNode("CEO");
        CEO.left = new TreeNode("CTO");
        CEO.right = new TreeNode("CFO");

        CEO.left.left = new TreeNode("Dev Lead");
        CEO.left.right = new TreeNode("HR");

        CEO.left.left.left = new TreeNode("Dev1");
        CEO.left.left.right = new TreeNode("Dev2");

        // Leaf nodes
        System.out.println("Leaf Nodes: Dev1 Dev2 HR CFO");

        System.out.println("Height: " + height(CEO));
        System.out.println("Depth of Dev Lead: " + depth(CEO, "Dev Lead", 0));

        System.out.print("Ancestors of Dev1: ");
        printAncestors(CEO, "Dev1");

        System.out.println("\nDegree of CTO: " + degree(CEO.left));
    }
}