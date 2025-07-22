package com.bugs;

public class Message {
    public static void main(String[] args) {
        // write a function that prints hello world;
        message(5);
    }

    static void message(int  n ){
        if (n == 0){
            return;
        }
        System.out.println("Hello world");
        message(n-1);
    }
}
