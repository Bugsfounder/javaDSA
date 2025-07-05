import java.util.Arrays;
import java.util.Scanner;

public class MultiDimenationArray {

    public static void main(String[] args) {
        /*
            2 3 4
            2 5 7
            6 4 3
         */

//        int[][] arr = new int[3][]; // the number of rows is mandatory not column

        int[][] arr = {
                {1, 2, 3}, //0th index
                {4, 5}, // 1st index
                {7, 8, 9, 10} // 2nd index -> arr2D[2] = {7,8,9,10}
        };

        for (int[] item : arr) {
            System.out.println(Arrays.toString(item));
        }

        int[][] arr1 = new int[3][3];
        // input
        Scanner input = new Scanner(System.in);
        for (int row = 0; row < arr1.length; row++) {
            // for each col in row
            for (int col = 0; col < arr1[row].length; col++) {
                arr1[row][col] = input.nextInt();

            }
        }

        // output
        for (int row = 0; row < arr1.length; row++) {
            for (int col = 0; col < arr1[row].length; col++) {
                System.out.print(arr1[row][col] + " ");
            }
            System.out.println();
        }

        for (int[] row : arr1) {
            System.out.println(Arrays.toString(row));
        }

    }
}
