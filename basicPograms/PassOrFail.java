package basicPograms;

import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        // System.out.println(sub1);
        // System.out.println(sub2);
        // System.out.println(sub3);
        float obtained = sub1 + sub2 + sub3;
        // System.out.println(obtained);
        double totalPercent = (obtained / 300) * 100;
        // System.out.println(totalPercent);

        if ((sub1 > 33 && sub2 > 33 && sub3 > 33) && totalPercent > 40) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
