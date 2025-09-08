package basicPograms;

import java.util.Scanner;

public class SumEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= n) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
