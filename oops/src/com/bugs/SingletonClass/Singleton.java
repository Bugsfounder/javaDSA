package com.bugs.SingletonClass;

public class Singleton {
    private int num = 0;

    private Singleton(){

    }

    private static Singleton instance;

    public static  Singleton getInstance(){
        // check weather 1 obj only is created or not
        if (instance == null){
            instance = new Singleton();
        }

        return  instance;
    }
}
