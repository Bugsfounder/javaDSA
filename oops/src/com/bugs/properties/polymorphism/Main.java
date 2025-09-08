package com.bugs.properties.polymorphism;

public class Main {
    public static void main(String[] args){
        Shapes shape =  new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Shapes square1 = new Square();

//        shape.area();
//        circle.area();
//        square.area();
//        square1.area();

        int k = 1;
        int n = 5;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < i; j++) {
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }
}
