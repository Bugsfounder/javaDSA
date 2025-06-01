package com.bugs;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // automatic type casting
//        float num = input.nextFloat();
//        float num = input.nextInt(); //  not error
//        int num = input.nextFloat(); // error
//        System.out.println(num);

        // type casting
//        int num = 12.43f; // error
        int num = (int)12.32; // correct
        int num1 = (int)(12.32); // correct

//        System.out.println(num);

        // automatic type promotion in expressins
//        int a = 257;
//        byte b = (byte) (a); // 257 % 256 = 1
//        System.out.println(b);

//        byte a =  40;
//        byte b = 50;
//        byte c = 100;
//
//        int d = (a*b)/c;
//        System.out.println(d);


        byte b = 50;
//        b = 50 *3 ; // error, because whenever we perform any kind of arithmetic operations on byte it promoted to int.
//        System.out.println(b);


        int number = 'A';
        System.out.println(number);
    }
}
