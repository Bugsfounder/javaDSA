package basicPograms;

import java.util.ArrayList;
import java.util.Scanner;

public class IsPresent {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 3, 7, 45, 2, 3, 4, 5, 3, 4, 8, 556, 34, 34, 56, 2, 3, 4, 5, 4, 23, 65, 87, 43 };
        Scanner input = new Scanner(System.in);
        int search = input.nextInt();
        int countOccurrence = 0;
        ArrayList<Integer> allIndex = new ArrayList<>();
        // for (int element : arr) {
        for (int index = 0; index < arr.length; index++) {
            // if (element == search) {
            if (arr[index] == search) {
                if (countOccurrence == 0) {
                    System.out.println("First Occurrence: " + index);
                }
                countOccurrence++;
                allIndex.add(index);
            }
        }
        System.out.println("Total Occurrence: " + countOccurrence);
        System.out.println("Total Occurrence Index: " + allIndex);
    }
}
