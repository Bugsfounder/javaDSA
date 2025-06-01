package com.bugs;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String fruit = in.next();

        switch (fruit){
            case "Mango":
                System.out.println("King of Fruit");
                break;
            case "Litchi":
                System.out.println("Test is best");
                break;
            case "Grapes":
                System.out.println("Small Fruit");
                break;
            default:
                System.out.println("Default statement");
                break;
//            case "Manisha":
//                System.out.println("Good Girl");
        }

        // Enhanced Switch case statements;
        switch (fruit){
            case "Mango" -> System.out.println("king of Fruit");
            case "Litchi"-> System.out.println("Test is best");
            case "Grapes" -> System.out.println("Small Fruit");
            default -> System.out.println("Enter Valid Fruit name");
        }

        int day = in.nextInt();
        switch (day){

            case 1,2,3,4,5 -> System.out.println("Weakday");
            case 6,7-> System.out.println("Weekend");
        }
    }
}
