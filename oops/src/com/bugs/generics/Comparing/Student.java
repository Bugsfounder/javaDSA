package com.bugs.generics.Comparing;

public class Student implements Comparable<Student>{
    int rollNo;
    float marks;

    public Student(int rollNo, float marks){
        this.rollNo = rollNo;
        this.marks = marks;

    }


    @Override
    public int compareTo(Student old) {
        int diff = (int)(this.marks - old.marks);

        // if diff == 0; means both are equal
        // if diff < 0: means old is bigger else old is smaller

        return diff;
    }
}
