package com.bugs;

public class SearchInRange {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

         int result = searchInRange(arr, 1,5,3);
        System.out.println(result);
    }

    static int searchInRange(int[] arr, int start, int end, int target){
        if (arr.length==0 || start>end){
            return  -1;
        }

        for (int i = start; i < end ; i++) {
            if (arr[i]==target){
                return  i;
            }
        }
        return  -1;
    }
}
