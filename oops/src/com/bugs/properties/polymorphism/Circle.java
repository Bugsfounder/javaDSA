package com.bugs.properties.polymorphism;

public class Circle extends Shapes{
    @Override
    void area(){
        System.out.println("area is pie * r * r");
    }
}
