package com.bugs.introduction;

public class WrapperExample {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        Integer num  = new Integer(54);
//        Integer num  = 45;

        Integer a = 10;
        Integer b = 20;
        swap(a, b);

        System.out.println(a + " " + b);

        final int bonus = 2;
//        bonus = 32; // can't modify

        final A manisha = new A("Manisha");
        manisha.name = "other name"; // allowed

        // when a non primitive is final, it cannot be reassigned.
//        manisha = new A("raja"); // not allowed

        A obj = new A("Manisha");
        System.out.println(obj);


//        for (int i = 0; i < 1000000000; i++) {
//            obj = new A("Random name");
//        }
    }

    static void swap(Integer a, Integer b){
        int temp = a;
        a = b;
        b = temp;
    }

}
class A{
//    final int num; // since you can't modify, then it is compulsion to initialize it while declaring it.

    final int num = 10;
    String name ;

    public A (String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed");
    }
}
