package com.bugs.access;

public class A {

    // if no access modifier specified, then the properties cannot be accessed outside the package
//    int num;
//    private  num;
    protected int num;
    String name;
    int[] arr;

    public int getNum(){
        return this.num;
    }

    public void setNum(int num){
        this.num = num;
    }
    public A(int num, String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
