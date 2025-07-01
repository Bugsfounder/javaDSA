import java.util.Arrays;
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        arr[0] = 43;
        arr[1] = 54;
        arr[2] = 32;
        arr[3] = 56;
        arr[4] = 34;

        System.out.println(arr[4]);


        // input using for loop
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // print all elements of the array using for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        // foreach
        for (int item : arr) {
            System.out.print(item + " ");
        }

        // trying to access a higher index element then the array size
//        System.out.println(arr[5]); // index out of bound error

        System.out.println();
        // easiest way to print an array
        System.out.println(Arrays.toString(arr));
    }

}
