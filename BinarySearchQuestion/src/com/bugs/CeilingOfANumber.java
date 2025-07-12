package com.bugs;

public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        int ans =getCeil(arr, target);
        int ans2 =getFloor(arr, target);
        System.out.println(ans);
        System.out.println(ans2);

        System.out.println(('o'-2));

    }


    public static int getCeil(int[] arr, int target){

        // what if the target is greater than the greatest number in the array --> no ceiling
        if (target > arr[arr.length - 1]){
            return  - 1;
        }

        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;

            if (arr[mid]==target){
                return target;
            }
            else if (target > arr[mid]){
                start = mid  + 1;
            }else{
                end = mid -1 ;
            }
        }
        return  start;
    }


    public  static int getFloor(int[] arr, int target){

        // what if the target is smaller than the smallest number of the arr --> no floor
        if (target < arr[0]){
            return  - 1;
        }
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end - start)/2;

            if (arr[mid]==target){
                return target;
            }else if (target > arr[mid]) {
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }
        return  end;
    }
}

/*
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;

        while(start <= end){
            // if(target >= letters[letters.length-1]){
            //     return letters[0];
            // }

            int mid = start + (end - start)/2;

            // if((int)target == (int) letters[mid]){
            //         int res = mid + 1;
            //         if ( (int)letters[res] != (int)target){
            //             return letters[res];
            //         }else{
            //             while((int)letters[res] == (int)target){
            //                 res += 1;
            //             }
            //         }
            //         return letters[res];
            // }
            // else
            if(target > letters[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        // return letters[start];
        return letters[start % letters.length];

    }
}
 */
