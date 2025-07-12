package com.bugs;

public class InfiniteArray {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,6,10,23,30,32,65,77,85};
        int target = 10;
        System.out.println(ans(arr, target));

    }

   static int ans(int[] arr, int target){
        // first find the range;
        // take a chunk of size 2;
        int start = 0;
        int end = 1;

        while (target > arr[end]){
            int newStart = end + 1;

            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        return BinarySearch(arr, target, start, end);
    }

   static int BinarySearch(int[] arr, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start)/2;

            if (target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid -1;
            }else{
                return mid;
            }
        }
        return  -1;
    }
}
