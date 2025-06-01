package com.bugs;

import java.util.Scanner;

public class CountOccurence {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int numberToCount = 3;
        int count = 0;
        while (number>0){
            int rem = number%10;
            if (rem==numberToCount){
                count ++;
            }
            number = number/10;
        }
        System.out.println(count);

    }
}
