package basicPograms;

import java.util.Scanner;

public class SumNumbersOfMultiplication {
    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for (int i = 0; i < 10; i++) {
            sum += num * (i + 1);
        }

        System.out.println(sum);
    }
}
