package com.assignment1;

import java.util.Scanner;

public class question_3 {
    public static void main(String[] args) {
//        Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

        Scanner input = new Scanner(System.in)  ;
        int sum = 0;
        while (true){
            System.out.println("Enter number: ");
            String val = input.next();
            if (val.equals("x")){
                System.out.println("Sum of numbers: "+sum);
                break;
            }

            sum += Integer.parseInt(val);
        }
    }
}
