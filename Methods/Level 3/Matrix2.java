import java.util.Random;

public class Matrix2 {

    public static void main(String[] args) {
        int[][] matrix2x2 = createRandomMatrix(2, 2);
        int[][] matrix3x3 = createRandomMatrix(3, 3);

        System.out.println("2x2 Matrix:");
        displayMatrix(matrix2x2);
        System.out.println("Determinant of 2x2 matrix: " + findDeterminant2x2(matrix2x2));

        System.out.println("\n3x3 Matrix:");
        displayMatrix(matrix3x3);
        System.out.println("Determinant of 3x3 matrix: " + findDeterminant3x3(matrix3x3));
        
        System.out.println("\nTranspose of 3x3 matrix:");
        int[][] transposedMatrix = findTranspose(matrix3x3);
        displayMatrix(transposedMatrix);

        System.out.println("\nInverse of 2x2 matrix:");
        double[][] inverseMatrix = findInverse2x2(matrix2x2);
        if (inverseMatrix != null) {
            displayMatrixDouble(inverseMatrix);
        }
    }

    public static int[][] createRandomMatrix(int rows, int cols) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10); // Random numbers from 0-9
            }
        }
        return matrix;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%-5d", value);
            }
            System.out.println();
        }
    }
    
    public static void displayMatrixDouble(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%-10.2f", value);
            }
            System.out.println();
        }
    }

    public static int[][] findTranspose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    public static int findDeterminant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    public static int findDeterminant3x3(int[][] matrix) {
        int det = 0;
        det += matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]);
        det -= matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]);
        det += matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
        return det;
    }

    public static double[][] findInverse2x2(int[][] matrix) {
        int determinant = findDeterminant2x2(matrix);
        if (determinant == 0) {
            System.out.println("Inverse does not exist for this matrix (determinant is 0).");
            return null;
        }
        double invDet = 1.0 / determinant;
        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] * invDet;
        inverse[0][1] = -matrix[0][1] * invDet;
        inverse[1][0] = -matrix[1][0] * invDet;
        inverse[1][1] = matrix[0][0] * invDet;
        return inverse;
    }
}