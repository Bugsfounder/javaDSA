package com.bugs;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        int largets =  num1;
        if (largets<num2) {
            largets = num2;
        }
        if (largets<num3){
            largets = num3;
        }

        System.out.println(largets);

    }
}
