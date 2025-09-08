package basicPograms;

import java.util.Scanner;

public class PayIncome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double income = sc.nextDouble();

        if (income > 10) {
            // 30%
            System.out.println(((float) 30 / 100) * income);

        } else if (income >= 5.0) {
            // 20%
            System.out.println(((float) 20 / 100) * income);

        } else if (income >= 2.5) {
            // 5%
            System.out.println(((float) 5 / 100) * income);

        } else {
            System.out.println("no Tax");
        }
    }
}
