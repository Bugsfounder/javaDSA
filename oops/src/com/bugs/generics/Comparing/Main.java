package com.bugs.generics.Comparing;

public class Main {
    public static void main(String[] args){
        Student manisha = new Student(12, 89.8f);
        Student raja = new Student(32,87.9f);

        if(manisha.compareTo(raja) > 0){
            System.out.println(manisha.compareTo(raja));
            System.out.println("Manisha has more marks");
        }

    }
}
