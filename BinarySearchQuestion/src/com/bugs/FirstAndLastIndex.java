package com.bugs;

public class FirstAndLastIndex {

    public static void main(String[] args) {


    }

    int[] firstAndLast(int[] arr, int target){
        int[] res = {-1,-1};
        int start = search(arr, target, true    );
        int end = search(arr, target, false);

        res[0] = start;
        res[1] = end;

        return res  ;

    }

    public int search(int[] arr, int target , boolean findFirstIndex){
        int ans =  -1;

        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target > mid){
                start = mid + 1;
            }else if (target < mid){
                end = mid -1 ;
            }else{
                ans = mid;

                if (findFirstIndex){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }

        }

        return ans;

    }
}
