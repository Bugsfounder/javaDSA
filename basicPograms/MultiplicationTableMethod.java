package basicPograms;

import java.util.Scanner;

public class MultiplicationTableMethod {
    static void multiplication(int n) {
        for (int i = 0; i < 10; i++) {
            System.out.println(n * (i + 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        multiplication(n);
    }
}
