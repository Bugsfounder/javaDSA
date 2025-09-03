package com.bugs.introduction;

public class Main {
    public static void main(String[] args){
        // store 5 roll numbers
        int[] rnumber = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students: {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

//        Student manisha = new Student();
        Student manisha = new Student(12,"Manisha", 89.9f);
//        System.out.println(manisha);

//        manisha.rno = 13;
//        manisha.name = "Manisha Kumari";
//        manisha.marks = 88.5f;

//        manisha.salary = 32; // not possible because of static type language java

        System.out.println(manisha.rno);
        System.out.println(manisha.name);
        System.out.println(manisha.marks);

//        manisha.changeName("Computer Lover");
//        manisha.greeting();


        Student randon = new Student(manisha);
        System.out.println(randon.name);

        Student random2 = new Student();
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;

        // both are updated
        one.name = "raja";
        System.out.println(one.name);
        System.out.println(two.name);
    }
}
// create a class
class Student{
    int rno ;
    String name;
    float marks ;

    // we need a way to add values of the above properties object by object

    // we need one work to access every object;
    void greeting(){
        System.out.println("Hello, My name is " + this.name);
    }

    void changeName(String newName){
        name = newName;
    }
//    Student(){
//        this.rno = 13;
//        this.name = "Manisha";
//        this.marks = 86.4f;
//    }
    Student(int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    Student (){
        // calling another constructor inside another constructor
        // internally: new Student(13, "default person", 100.00f);
        this(13, "default person", 100.00f);
    }

    Student (Student other){
        this.name = other.name;
        this.marks = other.marks;
        this.rno =  other.rno;
    }
}
