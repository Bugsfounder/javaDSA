package com.bugs;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        System.out.println(isPrime(n));
        System.out.println(isPrime2(n));


        System.out.println(armStrong(153));
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int i = 2;
        while (i < n) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    static boolean isPrime2(int n) {
        if (n <= 1) {
            return false;
        }

        int i = 2;
        while (i * i <= n) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
//        return true;
        return i * i >n;


    }

    static boolean armStrong(int num){

        int sum=0;
        int n = num;
        while (n>0){
            int rem = n%10;
            sum += rem*rem*rem;
            n = n/10;
        }
        return sum==num;
    }
}
