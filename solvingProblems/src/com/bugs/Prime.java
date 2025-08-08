package com.bugs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prime {
    static void isPrimePrint(int num){
        // edge cases
        if (num <=1){
            System.out.println("not prime");
            return;
        }
//        for(int i = 2; i < num; i++){
        for(int i = 2; i <= Math.sqrt(num); i++){
            if (num%i==0){
                System.out.println("not prime");
                return;
            }
        }
        System.out.println("prime");
    }

    static boolean isPrime(int num){
        // edge cases
        if (num <=1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }

    static List<Integer> allPrime(int start, int end){
        List<Integer> allPrimes = new ArrayList<>();
        for (int i = start; i <= end; i++){
            if (isPrime(i)){
                allPrimes.add(i);
            }
        }
        return allPrimes;
    }
    public static void main(String[]args){
        isPrimePrint(11);

        System.out.println(allPrime(2,10));
    }
}
