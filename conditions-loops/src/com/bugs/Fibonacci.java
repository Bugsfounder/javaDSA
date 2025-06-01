package com.bugs;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");


        for (int i = 2; i <= n; i++) {
            int c = a+b;
            a = b;
            b = c;
            System.out.print(c+" ");
        }

        System.out.println();
        a = 0;
        b = 1;
        int c = a+b;
        System.out.print(a + " " + b + " ");

        // using while loop
        int count =2;
        while (count<=n){
            c =  a+b;
            a = b;
            b = c;
            System.out.print(c+" ");
            count++;
        }

        System.out.println("\n"+c);
    }
}
