package com.bugs.properties.polymorphism;

public class Main {
    public static void main(String[] args){
        Shapes shape =  new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Shapes square1 = new Square();
        shape.area();
        circle.area();
        square.area();
        square1.area();
    }
}
