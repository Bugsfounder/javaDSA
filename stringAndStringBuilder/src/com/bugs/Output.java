package com.bugs;

import java.util.Arrays;

public class Output {
    public static void main(String[] args) {
        System.out.println(56);
//        System.out.println(56.toString()); // error
//        Integer num = new Integer(56); // deprecated
//        System.out.println(num.toString());
        int n = 32;
//        System.out.println(n.toString()); // error

        System.out.println("Manisha");
//        System.out.println(new int[]{1, 2, 3, 4});
        System.out.println(Arrays.toString(new int[]{1, 2, 3, 4}));

        String name = null;
        System.out.println(name);
    }
}
