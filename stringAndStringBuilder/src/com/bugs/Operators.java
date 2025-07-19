package com.bugs;

import java.util.ArrayList;

public class Operators {

    public static void main(String[] args) {
        System.out.println('a' + 'b'); // 195
        System.out.println("a" + "b"); // ab
        System.out.println('a' + 3);   // 100
        System.out.println((char) ('a' + 3)); // d

        System.out.println("a" + 1); // a1
        // this is the same as after a few steps: "a" + "1"
        // Note: integer will be converted to Integer that will call toString();

        System.out.println("Manisha" + new ArrayList<>()); // Manisha[]
        System.out.println("Manisha" + new Integer(56));

//        System.out.println(new Integer(56) + new ArrayList<>()); // error
        System.out.println(new Integer(56) + "" + new ArrayList<>()); // correct

    }
}
