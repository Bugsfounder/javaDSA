package basicPograms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SumMatrix {
    public static void main(String[] args) {

        int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] matrix2 = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] sum = new int[2][3];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        for (int[] row : sum) {
            System.out.println(Arrays.toString(row));
        }
    }
}
