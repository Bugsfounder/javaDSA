package com.bugs;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Manisha Kumari";

        System.out.println(name.toCharArray());
        System.out.println(Arrays.toString(name.toCharArray()));

        System.out.println(name.toLowerCase()); // creating a new object
        System.out.println(name); // original array still same
        System.out.println(name.indexOf('a'));
        System.out.println("     Manisha     ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
