package com.bugs.easy;

public class ProductOfSum {
    static int product(int n){
        if (n%10==n){
            return n;
        }
        return (n%10 )* product(n/10);
    }
    public static void main(String[] args) {
        System.out.println(product(524));
    }
}
