package com.bugs;

public class Shadowing {


    static int x = 90; // this will be shadowed at line number 9
    public static void main(String[] args) {
        System.out.println(x);
//        int x = 10;
        int x ; // declaration --> the shadowing of the variable x of the class is here
//        System.out.println(x); // error, x is not initialized
        x = 10; // initializing --> scope starts from here
        System.out.println(x);
        fun();
    }
    static  void fun(){
        System.out.println(x);
    }
}
