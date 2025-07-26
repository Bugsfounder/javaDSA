package com.bugs.easy;

public class NumberOfStepsL1342 {
    public int numberOfSteps(int num) {
        return helper(num, 0);
    }

    int helper(int num, int steps){
        if (num==0){
            return steps;
        }
        if (num%2==0){
            return helper(num/2, ++steps);
        }
        return helper(num-1, ++steps);

    }
    public static void main(String[] args) {

    }
}
