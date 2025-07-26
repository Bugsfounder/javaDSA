package com.bugs.easy;

public class Nto1 {
    public static void printTillN(int n){
        System.out.println(n);
        if (n==1){
            return;
        }
        printTillN(n-1);
    }
    public static void printTill1ToN(int n){
        if (n==0){
            return;
        }
        printTill1ToN(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        printTillN(5);
        printTill1ToN(5);
    }
}
