package com.bugs.properties.inheritance;

public class Box {
     private double l;
    double h;
    double w;
    double weight;

    Box(){
        System.out.println("Box class constructor");
        this.h = -1;
        this.l = -1;
        this.w = -1;

    }

    // cube
    Box(double side){
        // every class is inherited fron Object class
        super();
        this.w = side;
        this.l = side;
        this.h = side;

    }

    Box(double l, double h, double w){
        this.l = l;
         this.h = h;
        this.w = w;
    }

    Box(Box old){
        this.h = old.h;
        this.w = old.w;
        this.l = old.l;

    }

    public void information(){
        System.out.println("Running the box");
    }
}
