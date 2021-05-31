import java.util.Arrays;


public class Transpose {
    public static void main(String[] args) {
        int[][] matrix = new int[][] {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] transposeMatrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transposeMatrix[i][j] = matrix[j][i];
            }
        }

        System.out.println();
        printMatrix(transposeMatrix);
    }
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
                System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
