// Problem 3: Optimized N-Queens
class Problem3_NQueens {

    static int N = 4;
    static int[] board = new int[N];
    static boolean[] col = new boolean[N];
    static boolean[] diag1 = new boolean[2*N];
    static boolean[] diag2 = new boolean[2*N];

    static boolean solve(int row) {
        if (row == N) {
            print();
            return true;
        }

        for (int c = 0; c < N; c++) {
            if (!col[c] && !diag1[row+c] && !diag2[row-c+N]) {
                board[row] = c;
                col[c] = diag1[row+c] = diag2[row-c+N] = true;

                if (solve(row+1)) return true;

                col[c] = diag1[row+c] = diag2[row-c+N] = false;
            }
        }
        return false;
    }

    static void print() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i] == j ? "Q " : ". ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solve(0);
    }
}
