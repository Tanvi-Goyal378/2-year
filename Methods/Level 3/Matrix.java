import java.util.Random;

public class Matrix {

    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;

        int[][] matrixA = createRandomMatrix(rows, cols);
        int[][] matrixB = createRandomMatrix(rows, cols);

        System.out.println("Matrix A:");
        displayMatrix(matrixA);
        System.out.println("\nMatrix B:");
        displayMatrix(matrixB);

        System.out.println("\nMatrix Addition (A + B):");
        int[][] sumMatrix = addMatrices(matrixA, matrixB);
        if (sumMatrix != null) {
            displayMatrix(sumMatrix);
        }

        System.out.println("\nMatrix Subtraction (A - B):");
        int[][] diffMatrix = subtractMatrices(matrixA, matrixB);
        if (diffMatrix != null) {
            displayMatrix(diffMatrix);
        }

        System.out.println("\nMatrix Multiplication (A * B):");
        int[][] prodMatrix = multiplyMatrices(matrixA, matrixB);
        if (prodMatrix != null) {
            displayMatrix(prodMatrix);
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

    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        if (matrixA.length != matrixB.length || matrixA[0].length != matrixB[0].length) {
            System.out.println("Matrices must have the same dimensions for addition.");
            return null;
        }
        int[][] result = new int[matrixA.length][matrixA[0].length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return result;
    }

    public static int[][] subtractMatrices(int[][] matrixA, int[][] matrixB) {
        if (matrixA.length != matrixB.length || matrixA[0].length != matrixB[0].length) {
            System.out.println("Matrices must have the same dimensions for subtraction.");
            return null;
        }
        int[][] result = new int[matrixA.length][matrixA[0].length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                result[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        if (matrixA[0].length != matrixB.length) {
            System.out.println("Number of columns in first matrix must equal number of rows in second for multiplication.");
            return null;
        }
        int[][] result = new int[matrixA.length][matrixB[0].length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixB[0].length; j++) {
                for (int k = 0; k < matrixA[0].length; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return result;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%-5d", value);
            }
            System.out.println();
        }
    }
}