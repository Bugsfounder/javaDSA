package com.bugs;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int empID = in.nextInt();
        String department = in.next();

        switch (empID){
            case 1 -> System.out.println("Manisha");
            case 2-> System.out.println("Raja");
            case 3 -> {
                switch (department){
                    case "IT" -> System.out.println("IT Department");
                    case "Management"-> System.out.println("Management Department");
                    default -> System.out.println("No Department");
                }

            }
            default -> System.out.println("Enter correct employee ID");
        }

    }
}
