package com.bugs;

import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Bugsfounder";
        char target= 's';
        System.out.println(search(name,target));
        System.out.println(search2(name,target));
    }

    static  boolean search(String str, char target){
        if (str.isEmpty()){
            return  false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==target){
                return  true;
            }
        }

        return false;
    }

    static boolean search2(String str, char  target){
        if (str.length()==0){
            return false;
        }
        System.out.println("Array: "+ Arrays.toString(str.toCharArray())); // Array: [B, u, g, s, f, o, u, n, d, e, r]
        for(char ch : str.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return  false;
    }
}
