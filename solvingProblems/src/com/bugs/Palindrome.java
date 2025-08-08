package com.bugs;

public class Palindrome {
    static void palindrome(int n){
        int realInt  = n;
        n = Math.abs(n);
        int rev = 0;
        while(n > 0){
            rev = (rev * 10) + n % 10;
            n = n / 10;
        }
        if (rev==Math.abs(realInt)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not palindrome");
        }

    }
    public static void main(String[] args){
        palindrome(6446);
    }
}
