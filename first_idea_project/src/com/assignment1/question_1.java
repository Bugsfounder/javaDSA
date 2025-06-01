package com.assignment1;

import java.util.Scanner;

public class question_1 {
    public static void main(String[] args) {
//        Input a year and find whether it is a leap year or not.

        Scanner input = new Scanner(System.in);

        int year = input.nextInt();

        boolean isLeapYear = false;

        if ((year%4==0 && year %100 != 0) || (year %400==0)){
            System.out.println("It is a leap year.");
        }else{
            System.out.println("It is not a leap year.");
        }
    }
}
