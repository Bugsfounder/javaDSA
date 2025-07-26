package com.bugs.easy;

public class Factorial {
    static int factorial(int n){
        if (n==0 || n==1){
            return n;
        }
        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
