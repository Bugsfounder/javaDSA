package com.bugs.SingletonClass;
import com.bugs.access.A;
public class Main {
    public static void main(String[] args) {
        // Singleton obj = new Singleton(); // private is not accessible
         Singleton obj = Singleton.getInstance();
         Singleton obj2 = Singleton.getInstance();
         Singleton obj3 = Singleton.getInstance();

         // all 3 ref variables are pointing to just one object
        A a = new A(10, "manisha");
        a.getNum();
    }
}
