package com.bugs.properties.inheritance;

public class Main {
    public static void main(String[] args){
/*
        Box box = new Box();
        Box box1 = new Box(4);
        Box box2 = new Box(4, 3); // error, because there is no constructor which accept two arguments
*/
//        Box box = new Box(4.6, 7.9, 9.9);
//        System.out.println(box.l +" " + box.w + " " + box.h);
//        System.out.println(box.w + " " + box.h);

//        BoxWeight box3 = new BoxWeight();
//        BoxWeight box4 = new BoxWeight(2,3,4,5);
//        System.out.println(box3.h + " " + box3.weight);

        // works -> we can only access properties of parent class
        Box box5 = new BoxWeight(2,3,4,8);
        System.out.println(box5.w); // works
        // System.out.println(box5.weight); // not works

        // not works
        // there are many variables in both parent and child classes
        // you are given access to variables that are in the reference type i.e. Box Weight
        // hence, you should have access to weight variable
        // this also means, that the once you are trying to access should be initialized
        // but here, when the obj itself is the type of parent class, how will you call the constructor of child class
        // this is why error,
//        BoxWeight box6 = new Box(2,3,4,8); // error
//        System.out.println(box6);

        BoxPrice box = new BoxPrice();



    }
}
