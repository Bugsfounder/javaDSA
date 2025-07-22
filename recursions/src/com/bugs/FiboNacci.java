package com.bugs;

public class FiboNacci {
    public static void main(String[] args) {
        System.out.println(finonacci(6));
    }


    static int  finonacci(int n){
        // base condition
//        if (n==0 || n == 1){
        if (n < 2){
            return n;
        }

        // tail recursion, recursion call is at the bottom
        return finonacci(n-1) + finonacci(n-2);
    }
}
