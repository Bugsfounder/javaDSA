package com.bugs.abstractDemo;

// All the child class have to implement all abstract classes contained by parent class
public class Daughter extends Parent{
    public Daughter(int age){
        super(age);
//        this.age = age;
//        this.age = age;
    }
    @Override
    void career(String name){
        System.out.println("I am going to be a " + name);
    }

    @Override
    void partner(String name, int age){
        System.out.println("I love " + name + " he is " + age);
    }
}
