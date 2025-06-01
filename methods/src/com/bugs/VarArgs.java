package com.bugs;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {

        fun(1, 2, 3, 4, 5);
        fun(); // this is also work, no error --> empty array []
    }

    static void multiple(int a, int b, int... v) {
        System.out.println(a + " " + " " + b + " " + Arrays.toString(v));
    }

    // you cannot give more than one varargs into a method, and vararg must has to be at the end of the parameter list.
    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }
}
