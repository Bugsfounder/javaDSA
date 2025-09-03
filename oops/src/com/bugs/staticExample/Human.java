package com.bugs.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population ;
    Human(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
//        this.population +=1; // not use it
        Human.population +=1;

        Human.message();

    }
    static void message(){
        System.out.println("hello world");
    }

}
