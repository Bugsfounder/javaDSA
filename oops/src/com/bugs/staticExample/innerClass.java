package com.bugs.staticExample;
class Test{
    // only inner classes can be static
    String name;

    public Test(String name){
        this.name = name ;
    }

    @Override
    public String toString(){
        return name;
    }
}
public class innerClass {
//    static class Test{
//        // only inner classes can be static
//        String name;
//
//        public Test(String name){
//            this.name = name ;
//        }
//    }


    public static void main(String[] args){
        Test a = new Test("Manisha");
        Test b = new Test("Raja");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}

// can't be possible
//static class A{
//
//}
