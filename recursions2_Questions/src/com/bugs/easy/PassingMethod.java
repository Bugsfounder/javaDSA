package com.bugs.easy;

public class PassingMethod {
    static void func(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
//        func(n--); // --> this is wrong, infinite
        func(--n); // --> this is correct
    }
    public static void main(String[] args) {
        func(5);
    }
}
