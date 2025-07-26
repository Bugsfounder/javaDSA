package com.bugs.easy;

public class ReverseANumber {
    // using global variable
    static int revN ;
    static void rev(int n){
        if (n==0){
            return;
        }
        revN = (revN * 10) + n%10;
        rev(n/10);
    }

    // without global variable
    static int rev2(int n){
       int digits = (int)(Math.log10(n)+1);

       return helper(n, digits);
    }

    static int  helper(int n, int digits){
        if (n==0){
            return 0;
        }
        return (n%10) * (int)Math.pow(10, digits-1) + helper(n/10, --digits);
    }

    static boolean palindrome(int n){
        revN = 0;
        rev(n);
        return revN==n;
    }

    static boolean palindromePtr(int n){
        String nStr = String.valueOf(n);
        return palindromeHelper(nStr, 0, nStr.length()-1 );
    }

   static boolean palindromeHelper(String n, int start, int end){
        if (end <start){
            return true;
        }
        if (n.charAt(start)!=n.charAt(end)){
            return false;
        }
        palindromeHelper(n, ++start, --end);
        return true;

    }
    public static void main(String[] args) {
        rev(12345);
        System.out.println(revN);

        System.out.println(rev2(12345));

        System.out.println(palindrome(12321));
        System.out.println(palindrome(132424231));
        System.out.println(palindrome(132424231));
        System.out.println(palindrome(132424331));
        System.out.println(palindrome(12321));
    }
}
