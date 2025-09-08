package basicPograms;

import java.util.Scanner;

public class TypeOfWebsite {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String website = input.next();
        if (website.contains(".com")) {
            System.out.println("Commercial Website");
        } else if (website.contains(".org")) {
            System.out.println("Organization Website");
        } else if (website.contains(".in")) {
            System.out.println("Indian Website");
        } else {
            System.out.println("Unknown Organization");
        }
    }
}
