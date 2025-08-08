package com.bugs;

public class Main {
    static void maximum(int a, int b, int c){
        int max = a;
        if (max < b){
            max = b;
        }
        if (max < c){
            max = c;
        }

        System.out.println(max);
        // or
        System.out.println(Math.max(a, Math.max(b,c)));
    }
    static  void minimum(int a, int b, int c){
        int min = a;
        if (min > b){
            min = b;
        }
        if (min > c){
            min = c;
        }

        System.out.println(min);
        // or
        System.out.println(Math.min(a, Math.min(b, c)));
    }

    public static void main(String[] args) {
        maximum(1,2,3);
        minimum(1,2,3);
    }
}
