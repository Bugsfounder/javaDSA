package com.bugs.easy;

public class SumNNumber {

    static int sumTillN(int n){
        if (n<1){
            return n;
        }
        return n + sumTillN(n-1);
    }
    public static void main(String[] args) {
        System.out.println(sumTillN(5));
    }
}
