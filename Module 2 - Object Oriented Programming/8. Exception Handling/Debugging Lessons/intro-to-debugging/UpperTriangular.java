import java.util.Arrays;

public class UpperTriangular {
    public static void main(String[] args) {
        int[][] matrix = new int[][] {
            {1, 2, 3},
            {8, 6, 4},
            {4, 5, 6}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; i++) {
                matrix[i][j] = 0;
            }
        }
        printArray(matrix);
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
