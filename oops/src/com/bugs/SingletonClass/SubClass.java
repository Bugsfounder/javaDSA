package com.bugs.SingletonClass;
import com.bugs.access.A;



public class SubClass extends A{
    public SubClass(int num, String name){
        super(num, name);
//        Object
    }
    public static void main(String[] args){
        SubClass obj = new SubClass(45, "Manisha");
        int n = obj.num; // can be accessible
        // protected members can be access in different packages, only by the subclass
        // that's why this is not allow to access num property.
        A obj1 = new A(1, "M");
//        obj1.num; // cannot be accessible
    }
}
class SubSubClass   extends SubClass{

    public SubSubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubSubClass obj = new SubSubClass(43,"Manisha");
        int n= obj.num;
    }
}
class SubClass2 extends A{

    public SubClass2(int num, String name){
        super(num, name);
    }
    public static void main(String[] args){
        SubClass2 obj = new SubClass2(45, "Manisha");

    }
}
