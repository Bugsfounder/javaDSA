package com.bugs.easy;

public class SumOfDigits {
    static int sum = 0;

    static void sumUsingGlobalVariable(int n){
       sum+=n%10;
       if (n%10 == n){
           return;
       }
       sumUsingGlobalVariable(n/10);
    }

    static int sumF(int n){
        if (n==0){
            return 0;
        }
        return (n%10) + sumF(n/10);
    }
    public static void main(String[] args) {
        sumUsingGlobalVariable(1342);
        System.out.println(sum);
        System.out.println(sumF(53));
    }
}
