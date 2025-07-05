package com.bugs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        int[] nums = {23,45,1,2,8,19,-3,16,-11,28};
        int target = in.nextInt();
        int ans = linearSearch(nums,target);
        System.out.println(ans);

    }

    // search in the array: return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int target){
        if (arr.length==0){
            return -1;
        }

        // run a for loop
        for (int index = 0; index < arr.length; index++) {
                // check for an element at every index if it is == target
            int element = arr[index];
            if (element==target){
                return index;
            }
        }

//        this line will execute only when an item is not found in the list
        return  -1;
    }

    // return element, have to take care of -1, may be target will be the -1
    static int linearSearch2(int[] arr, int target){

        for (int item: arr){
             if (item == target){
                 return  item;
             }
        }
        return  Integer.MAX_VALUE;
    }

     static boolean linearSearch3(int[] arr, int target){
        for (int item: arr){
            if (item==target){
                return true;
            }
        }
        return false;
    }
}
