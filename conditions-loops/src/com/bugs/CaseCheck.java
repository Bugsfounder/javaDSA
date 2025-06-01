package com.bugs;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in)  ;
        char  character = input.next().trim().charAt(0);

//        if (character.equals(character.toUpperCase())){
        if (character >='A' && character<='Z'){
            System.out.println(character + " is in UpperCase");
        }else{
            System.out.println(character + " is lowerCase");
        }
    }
}
