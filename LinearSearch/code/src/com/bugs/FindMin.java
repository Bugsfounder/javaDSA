package com.bugs;

public class FindMin {
    public static void main(String[] args) {

        int[] arr= {14,26,34,4,765,654,77,5,568};

        int min = getMin(arr);
        System.out.println(min);
        int minR = minInRange(arr,4,6);
        System.out.println(minR);
    }

    static int getMin(int[] arr){
        int min = arr[0];
        for (int i=1; i < arr.length; i++){
            if (arr[i]<min){
               min = arr[i];
            }
        }
        return min;
    }

    static int minInRange(int[] arr, int start, int end){
        int min = arr[start];

        for (int i=start; i<=end; i++){
            if (arr[i] < min){
                min=arr[i];
            }
        }

        return min;
    }
}
