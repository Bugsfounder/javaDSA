package com.bugs;

public class Grade {
    static void grade(int marks){
        if (marks<0 || marks > 100){
            System.out.println("invalid input");
            return;
        }
        if (marks>=91){
            System.out.println("AA");
        }
        else if (marks >= 81){
            System.out.println("AB");
        }
        else if (marks >= 71 ){
            System.out.println("BB");
        }
        else if (marks >= 61 ){
            System.out.println("BC");
        }
        else if (marks >= 51 ){
            System.out.println("CD");
        }
        else if (marks >= 41 ){
            System.out.println("DD");
        }
        else {
            System.out.println("Fail");
        }
    }
    public static void main(String[] args){
        grade(92);
        grade(82);
        grade(72);
        grade(62);
        grade(52);
        grade(43);
        grade(32);
    }
}
