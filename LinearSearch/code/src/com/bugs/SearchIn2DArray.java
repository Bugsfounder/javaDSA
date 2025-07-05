package com.bugs;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
//        int[][] arr =new int[][] { // --> correct
        int[][] arr = {
                {23,4,1},
                {1,23,643,65,24},
                {54,86,3,43,98,34}
        };

        int target =34;
        int[] res = search(arr, target);
        System.out.println(Arrays.toString(res));
        int resMax = max(arr, target);
        System.out.println((resMax));
    }

    static int[] search(int[][]arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]==target){
                    return new int[] {row, col};
                }
            }
        }
            return new int[]{-1,-1};
    }

    static int max(int[][] arr, int target){
//        int maxVal = arr[0][0];
        int maxVal = Integer.MIN_VALUE;
        for (int[] row : arr) {
            for (int element : row) {
                if (element > maxVal) {
                    maxVal = element;
                }
            }
        }
        return maxVal;
    }
}
