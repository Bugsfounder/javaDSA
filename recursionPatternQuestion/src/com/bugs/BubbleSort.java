package com.bugs;

import java.util.Arrays;

public class BubbleSort {
    static void bubble(int[] arr, int r, int c){
        if (r==0){
            return;
        }
        if (c<r){
            if (arr[c] > arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }

            bubble(arr, r ,c+1);

        }else{
            bubble(arr, r-1, 0);
        }
    }

    // did myself
    static void bubble2(int[] arr, int pass, int col){
            if (pass==0){
                return;
            }
            if (col < pass ) {
                if (arr[col] > arr[col + 1]) {
                    swap(arr, col, col + 1);
                }
                bubble2(arr, pass, col + 1);
            }
            else{
                bubble2(arr, pass-1, 0);
            }
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] =  temp;
    }


    public static void main(String[] args) {
//        int[] arr = {4,3,2,1};
        int[] arr = {1,3,4,5,2,6};
//        bubble(arr, arr.length-1, 0);
//        System.out.println(Arrays.toString(arr));

        bubble2(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));

    }
}
