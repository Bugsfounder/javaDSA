package basicPograms;

import java.util.Scanner;

public class FirstNNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i = 0;
        int sum = 0;
        while (i < n) {
            i++;
            sum += i;
        }
        System.out.println(sum);
    }
}
