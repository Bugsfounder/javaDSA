package com.bugs;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);

        for (int num = 1; num<=5; num++){
            System.out.println(num);
        }

        int num = 1;
        while(num<=5){
            System.out.println(num);
            num ++;
        }

        num=1;
        do {
            System.out.println(num);
            num++;
        }while (num<=5);
    }
}
