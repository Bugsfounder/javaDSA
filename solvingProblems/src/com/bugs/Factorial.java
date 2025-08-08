package com.bugs;

import java.math.BigInteger;

public class Factorial {
    static void factorial(int n){
        if (n < 0){
            System.out.println("invalid input");
            return;
        }
//        int fact = 1;
        // int get overflow if large numbers
        BigInteger fact = BigInteger.ONE;
        for(int i = 2; i <= n; i++){
//            fact *= i;
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fact);
    }
    public static void main(String[] args){
        factorial(5);
        factorial(3);
        factorial(50);
        factorial(100);
    }
}
