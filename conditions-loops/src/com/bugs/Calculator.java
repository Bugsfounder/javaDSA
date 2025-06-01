package com.bugs;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans =0;
        while ( true){
            System.out.print("Enter Operation: ");
            char ch = in.next().trim().charAt(0);
            if (ch == '+'|| ch=='-'||ch=='*'||ch=='/'||ch=='%'){
                // take input of two numbers;
                System.out.print("Enter Number 1 and 2: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (ch=='+'){
                    ans = num1+num2;
                } else if (ch=='-'){
                    ans = num1-num2;
                } else if (ch=='*'){
                    ans = num1*num2;
                } else if (ch=='/'){
                    if (num2!=0){
                        ans = num1/num2;
                    }
                } else {
                    ans = num1%num2;
                }
            }
            else if (ch=='x' || ch=='X'){

                break;
            }
        System.out.println(ans);
        }
    }
}
