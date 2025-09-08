package basicPograms;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int i = 0;
        while (i < n) {
            int j = 0;
            while (j < n - i) {
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
