package basicPograms;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println(num + " X " + (i + 1) + " = " + (num * (i + 1)));
        }
        System.out.println();
        for (int i = 10; i > 0; i--) {
            System.out.println(num + " X " + (i) + " = " + (num * (i)));
        }
        System.out.println();
        int i = 10;
        while (i > 0) {
            System.out.printf("%d X %d = %d\n", num, i, num * i);
            i--;
        }
    }
}
