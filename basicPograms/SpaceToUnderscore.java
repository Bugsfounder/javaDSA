package basicPograms;

import java.util.Scanner;

public class SpaceToUnderscore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(str.replace(" ", "_"));
    }
}
