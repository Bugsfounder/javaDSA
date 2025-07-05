package com.bugs;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,1,6},
                {3,3,7}
        };

        System.out.println(maximumWealth(arr));
    }

    static int maximumWealth(int[][] accounts){
//        int maxWealth = 0;
        // variable to store max wealth
        int maxWealth = Integer.MIN_VALUE;

        // iterating over each person in
        for (int[] person : accounts) {
            int totalWealthPerPerson = 0;

            for (int amountPerAccount : person) {
                totalWealthPerPerson += amountPerAccount;
            }

            if (totalWealthPerPerson > maxWealth) {
                maxWealth = totalWealthPerPerson;
            }
        }
        return maxWealth;
    }
}
