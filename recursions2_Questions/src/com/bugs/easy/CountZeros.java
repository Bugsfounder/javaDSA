package com.bugs.easy;

public class CountZeros {
    static  int countZero(int n){
        return helper(n, 0);
    }

    static int helper(int n, int count){
        if (n==0){
            return count;
        }
        if (n%10==0){
            count++;
        }
        return helper(n/10, count);
    }

    public static void main(String[] args) {
        System.out.println(countZero(102010));
        System.out.println(countZero(10));
    }
}
