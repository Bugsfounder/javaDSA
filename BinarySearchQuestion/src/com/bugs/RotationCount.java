package com.bugs;

public class RotationCount {

    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};

        System.out.println(countRotate(arr)+1);


    }


    static int countRotate(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] < arr[mid-1] && mid > start){
                return  mid - 1;
            }
            if(arr[mid] > arr[mid+1]  && mid < end){
                return mid  ;
            }
            if(arr[start] >= arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return  -1;
    }

}
