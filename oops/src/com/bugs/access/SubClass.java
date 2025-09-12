package com.bugs.access;

public class SubClass extends A{
    public SubClass(int num, String name){
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(43,"Manisha");
        int n = obj.num;
    }
}
