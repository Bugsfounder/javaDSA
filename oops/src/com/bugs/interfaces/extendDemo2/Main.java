package com.bugs.interfaces.extendDemo2;

public class Main implements A, B {
    @Override
    public  void fun(){
        System.out.println();
    }
    @Override
    public void greet(){
        System.out.println();
    }

    public static void main(String[] args) {
        Main obj = new Main();

        A.greeting();
    }

}
