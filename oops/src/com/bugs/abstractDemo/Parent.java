package com.bugs.abstractDemo;

// any class that contains one or more that one abstract classes, that class also should be of abstract class
public abstract class Parent {
    int age;
    final int VALUE;
    public Parent(int age){
        this.age = age;
        VALUE = 40439843;
    }

//    abstract Parent(); // abstract constructors not allowed
//    static abstract void hello(); // not allowed, static abstract classes are not allowed

    // we can create static method inside abstract class Parent
    static void hello(){
        System.out.println("hello world");
    }

    // can abstract classes contain normal methods
    void normal(){
        System.out.println("this is a normal method");
    }

    abstract void career(String name);
    abstract void partner(String name, int age);
}
