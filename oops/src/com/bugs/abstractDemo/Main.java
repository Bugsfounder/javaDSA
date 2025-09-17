package com.bugs.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(32);
        son.career("Doctor");
        son.normal();
        Daughter daughter = new Daughter(23);
        daughter.career("Coder");

//        Parent mom = new Parent();// we can't take object of an abstract class


        Parent.hello();

    }
}
