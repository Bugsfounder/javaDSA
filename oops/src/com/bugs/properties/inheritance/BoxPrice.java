package com.bugs.properties.inheritance;

public class BoxPrice extends BoxWeight{

    double cost;

    BoxPrice(){
        super();
        this.cost  = -1;
    }

    BoxPrice(BoxPrice other){
        super(other);
        this.cost = other.cost;
    }

    BoxPrice(double price){
        this.cost = price;
    }

    BoxPrice( double l, double h, double w, double weight, double cost){
        super(l, h ,w, weight);
    }
    BoxPrice(double side, double weight, double cost)   {
        super(side, weight);
    }
}
