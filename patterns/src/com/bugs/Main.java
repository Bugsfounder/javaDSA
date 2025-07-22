package com.bugs;

public class Main {
    public static void main(String[] args) {
//        pattern2(4);
//        pattern1(5);
//        pattern3(5);
//        pattern4(5);
//        pattern5(5);
//        pattern28(5);
//        pattern30(5);
//        pattern17(5);
        pattern31(4);

    }
static int min(int[] arr){
    int minv = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] < minv){
            minv = arr[i];
        }
    }
    return minv;
}
    static void pattern31(int n){
        int origionalN= n;
        n = 2 * n-1;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int right  = n-col, down = n-row;
                int atEveryIndex = origionalN -  Math.min(Math.min(col, row), Math.min(n-row, n-col));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }
    static void pattern17(int n){
        for (int row = 1; row <= n * 2; row++) {
            int c = row > n ? 2 * n - row: row;
            // space
            for (int i = 0; i <n-c ; i++) {
                System.out.print("  ");
            }
            // row to 1
            for (int colF = c; colF >= 1; colF--) {
                System.out.print(colF+" ");
            }
            // 2 to row
            for (int colfS = 2; colfS <= c; colfS++) {
                System.out.print(colfS+" ");
            }
            System.out.println();
        }
    }
    static void pattern30(int n){
        for (int row = 1; row <= n; row++) {
            // space
            for (int i = 0; i <=n-row ; i++) {
                System.out.print("  ");
            }
            // row to 1
            for (int colF = row; colF >= 1; colF--) {
                System.out.print(colF+" ");
            }
            // 2 to row
            for (int colfS = 2; colfS <= row; colfS++) {
                System.out.print(colfS+" ");
            }
            System.out.println();
        }
    }
    static void pattern28(int n){
        for (int row = 0; row < n * 2; row++) {
            int nOfStar = row < n ? row : 2*n-row;
            int nOfSpace = n-nOfStar ;
            for (int space = 0; space < nOfSpace; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star < nOfStar; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for (int row = 0; row < 2 * n;row++) {
            int c =row>n ? 2 * n -row : row;
            for (int col = 0; col < c; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row + 1; col++) {
                System.out.print(col+1+" ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for (int row = n; row > 0; row--) {
            for (int col = 0; col < row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int i = 0; i < n; i++) {
            // for every row, run the col
            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }

    static void pattern1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }





}
