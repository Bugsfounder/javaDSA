package com.bugs;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 4, 19};
        String name = "Manisha";
        String name2 = "Manisha";
//        name[0] = "d"; // error
        name = "kumari";
        System.out.println(name + name2);
//        System.out.println(name);

        // pointing to the same object in heap (String pool);
        String a = "Manisha";
        String b = "Manisha";
        // string objects cannot be changed, it's just creating a new object
        System.out.println(a);
        a = "Kumari";
        System.out.println(a);

    }
}
