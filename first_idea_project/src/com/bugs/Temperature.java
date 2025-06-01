package com.bugs;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        °F = (°C * 9/5) + 32

        float tempC = input.nextFloat();
        float tempF = (tempC*9/5) +32;
        System.out.println(tempF);
    }
}
