package com.bugs;

public class Comparison {

    public static void main(String[] args) {
        String a = "Manisha";
        String b = "Manisha";

        // == : checks if reference variables are pointing to the same object;
        System.out.println(a==b); // true;

        // how to create diff object of the same value; // new creating string in string pool, --> not recommended
        String str = new String("Manisha");
        String str2 = new String("Manisha");
        System.out.println(str2==str); // false

        // to check only values are same use .equals() method;
        System.out.println(str2.equals(str)); // true

        // can't access [0] have to use .charAt()
        System.out.println(str2.charAt(0));

    }
}
