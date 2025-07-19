package com.bugs;

public class Palindrome {
    public static void main(String[] args) {
//        String str = null;
        String str = "abcba";

        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome2(str));
    }

    static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        str = str.toLowerCase();
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
//            if (str.charAt(start) == str.charAt(end)) {
//                start++;
//                end--;
//                isPalin = true;
//            } else {
//                isPalin = false;
//                break;
//            }

            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;

        }
        return true;
    }

    static boolean isPalindrome2(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
