package com.bugs.properties.inheritance;

public class BoxWeight  extends Box{
    double weight;

     public BoxWeight(){
        this.weight = -1;
        // this.h = 3; // works fine
        // this.l = 3; // not works because this is private
    }

    BoxWeight(BoxWeight other){
        super(other);
        weight = other.weight;
    }

    BoxWeight(double side, double weight){
         super(side);
         this.weight = weight;
    }

   public BoxWeight(double l, double h, double w, double weight){
        super(l,h,w); // what is this ? call the parent class constructor
       System.out.println("BoxWeight class constructor");
        // used to initialized values parent in parent class
       System.out.println(this.weight); // access variable with same name from current class
       System.out.println(super.weight); // access variable of same name from super class
         this.weight = weight;
   }
}
