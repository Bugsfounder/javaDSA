package com.bugs;

import java.util.Scanner;

public class Primitives {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a Number: ");
        int rollNo = input.nextInt();
        System.out.println("Your roll no. is: "+rollNo);

        int a = 234_000_000;
        System.out.println(a);
    }
}
