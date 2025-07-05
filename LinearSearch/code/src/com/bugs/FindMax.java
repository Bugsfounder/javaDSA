package com.bugs;

public class FindMax {
    public static void main(String[] args) {
        int[] arr= {14,26,34,4,765,654,77,5,568};


        int max = getMax(arr);
        System.out.println(max);
        int maxR = maxInRange(arr, 1,4);
        System.out.println(maxR);
    }

    static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    static int maxInRange(int[] arr, int start, int end){
        int max = arr[start];
        for (int i=start; i<=end; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
