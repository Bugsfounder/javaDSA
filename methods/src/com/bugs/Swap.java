package com.bugs;

public class Swap {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        int temp = a;
        a = b;
        b =temp;
        System.out.println(a+" "+b);

        swap(a, b);

        String name = "Manisha Kumari";
        changeName(name);
        System.out.println(name);
    }

    static  void changeName(String name){
        name = "Raja Mahanty";

    }

    static  void swap(int a, int b){
        int temp = a;
        a = b;
        b =temp;
    }


}
