package com.assignment1;

import java.util.Scanner;

public class question_2 {
    public static void main(String[] args) {
//        Take 2 numbers as inputs and find their HCF and LCM.

        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int n1 = num2;
        int n2 = num1%num2;

        while (n2!=0){
            int temp = n2;
             n2 = n1%n2;
             n1 = temp;
        }

        int hcf = n1;
        int lcm = (num1*num2)/hcf;
        System.out.println("hcf: "+ hcf);
        System.out.println("lcm: "+lcm);

    }

}
