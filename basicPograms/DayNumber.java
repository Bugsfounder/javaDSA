package basicPograms;

import java.util.Scanner;

public class DayNumber {
    public static void main(String[] args) {
        String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if (input <= 7 && input >= 1) {
            System.out.println(days[input - 1]);
        } else {
            System.out.println("Invalid Input");
        }

    }
}
