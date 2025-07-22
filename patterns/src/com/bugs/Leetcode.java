package com.bugs;
import java.util.Arrays;
public class Leetcode {
    public static int heightChecker(int[] heights) {

        int[] expected = new int[heights.length];
        System.arraycopy(heights, 0, expected, 0,expected.length);
        Arrays.sort(expected);
        int count = 0;
        System.out.println(Arrays.toString(expected)+" "+Arrays.toString(heights));
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }
        return count;
    }

    public static int heightChecker2(int[] heights){
        int i = 0;
        int count = 0;
        int max = 0;
        while(i < heights.length-1){
            if (heights[i] > heights[i+1]){
                if (heights[i+1]<max){
                    count++;
                }
                if (heights[i] > max){
                    max = heights[i];
                }
                count++;
            }
            i++;
        }
        return count;
    }
    public static void main(String[] args) {
//        int[] arr = {1,1,4,2,1,3};
        int[] arr = {5,1,2,3,4};

//        System.out.println((heightChecker(arr)));
        System.out.println((heightChecker2(arr)));

    }


}
