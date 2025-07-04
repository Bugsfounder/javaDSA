package com.bugs;

public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {12,433,6,2334,657774};
        System.out.println(findNumbers(arr));

        System.out.println(digits(2352));
        System.out.println(digits2(431245));
    }

    static  int findNumbers(int[] nums){
        int count = 0;

        for(int num: nums){
            if (even(num)){
                count++;
            }
        }


        return count;
    }

    // function to check whether a number contains even digits or not
    static boolean even(int num){
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    static int digits2(int num){
        if (num<0){
            num = num*-1;
        }
        return (int)(Math.log10(num)) +1;
    }
    static int digits(int num){
        if (num<0){
            num = num*-1; // -> -12 * -1 = 12
        }
        if (num == 0){
            return 1;
        }
        int count = 0;
        while (num>0){
            count++;
            num = num/10;
        }
        return count;
    }
}
