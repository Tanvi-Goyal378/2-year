import java.util.Stack;

class ExprNode {
    String data;
    ExprNode left, right;

    ExprNode(String data) {
        this.data = data;
    }
}

public class ExpressionTree {

    static void inorder(ExprNode root) {
        if (root == null) return;
        System.out.print("(");
        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);
        System.out.print(")");
    }

    static void preorder(ExprNode root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    static void postorder(ExprNode root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    // Evaluate postfix using stack
    static int evaluatePostfix(String[] exp) {
        Stack<Integer> st = new Stack<>();

        for (String s : exp) {
            if (Character.isDigit(s.charAt(0))) {
                st.push(Integer.parseInt(s));
            } else {
                int b = st.pop();
                int a = st.pop();

                switch (s) {
                    case "+": st.push(a + b); break;
                    case "-": st.push(a - b); break;
                    case "*": st.push(a * b); break;
                    case "/": st.push(a / b); break;
                }
            }
        }
        return st.pop();
    }

    public static void main(String[] args) {
        // Build tree for (3+5)*(8-2)
        ExprNode root = new ExprNode("*");

        root.left = new ExprNode("+");
        root.right = new ExprNode("-");

        root.left.left = new ExprNode("3");
        root.left.right = new ExprNode("5");

        root.right.left = new ExprNode("8");
        root.right.right = new ExprNode("2");

        System.out.print("Inorder: ");
        inorder(root);

        System.out.print("\nPreorder: ");
        preorder(root);

        System.out.print("\nPostorder: ");
        postorder(root);

        // Evaluate postfix
        String[] postfix = {"3","5","+","8","2","-","*"};
        System.out.println("\nResult: " + evaluatePostfix(postfix));
    }
}