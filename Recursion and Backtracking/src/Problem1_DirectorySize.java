// Problem 1: Recursive Directory Size Calculator
class Problem1_DirectorySize {
    static class Node {
        String name;
        int size;
        Node[] children;

        Node(String name, int size) {
            this.name = name;
            this.size = size;
        }

        Node(String name, Node[] children) {
            this.name = name;
            this.children = children;
        }
    }

    public static int getDirectorySize(Node node) {
        if (node.children == null) return node.size;

        int total = 0;
        for (Node child : node.children) {
            total += getDirectorySize(child);
        }
        return total;
    }

    public static void main(String[] args) {
        Node root = new Node("project", new Node[] {
            new Node("src", new Node[] {
                new Node("main.java", 100),
                new Node("utils.java", 50)
            }),
            new Node("docs", new Node[] {
                new Node("readme.txt", 10),
                new Node("guides", new Node[] {
                    new Node("setup.pdf", 200)
                })
            }),
            new Node("config.xml", 20)
        });

        System.out.println("Total Size: " + getDirectorySize(root) + " KB");
    }
}
