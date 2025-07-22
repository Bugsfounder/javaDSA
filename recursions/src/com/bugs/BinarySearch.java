package com.bugs;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr= {1,2,4,5,6, 55,66,78};
//        int[] arr= {1};
        int target = 66;
        System.out.println(binarySearch(arr, target, 0, arr.length-1));


    }

    static int binarySearch(int[] arr, int target, int start, int end){
//            if (arr.length == 0 || target > arr[end] || target < arr[0] || start > end){
            if (start > end){
                return -1;
            }
            int mid = start + ((end) - start)/2;

            if (arr[mid] > target){
                end = mid -1;
                return  binarySearch(arr, target, start, end);
            }
            else if(arr[mid] < target){
                start = mid+1;
                return binarySearch(arr, target,start, end );
            }
            return  mid;
    }
}
