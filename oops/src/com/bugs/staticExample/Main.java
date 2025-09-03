package com.bugs.staticExample;

public class Main {
    public static void main(String[] args) {
        Human manisha = new Human(22, "Manisha", 1000000, false);
        Human raja = new Human(22, "Raja", 1500000, false);
        Human shalini = new Human(22, "Raja", 1500000, false);

        System.out.println(manisha.name);

        // recommended way to use static property is by using class name, Human.
        System.out.println(Human.population);
        System.out.println(Human.population);
        System.out.println(Human.population);


//        greeting();
        Main funn = new Main();
        funn.fun2();
    }

    // this is not dependent on object
    static void fun(){
       // greeting(); // you cannot use it here because it requires an instance
        // but the function you are using it in does not depend on instances.

        // you cannot access non-static stuff without referencing their instances in a static context.

        // hence, here I am referencing it
        Main obj = new Main();
        obj.greeting();
    }


    void fun2(){
        greeting();
    }

    // we know that something which is not static, belongs to an object
    void greeting(){
        System.out.println("Hello world");
    }
}
