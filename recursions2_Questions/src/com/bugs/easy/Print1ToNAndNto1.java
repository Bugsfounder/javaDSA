package com.bugs.easy;

public class Print1ToNAndNto1 {

    static void printBoth(int n){
        System.out.println(n);
        if (n==1){
            return;
        }
        printBoth(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        printBoth(5);
    }
}
