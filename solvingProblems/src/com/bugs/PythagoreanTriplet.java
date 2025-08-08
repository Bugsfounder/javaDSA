package com.bugs;

public class PythagoreanTriplet {
    static void pythagoreanTriplet(int n1, int n2, int n3){
        n1 = n1*n1;
        n2 = n2*n2;
        n3 = n3*n3;
//        if (Math.pow(n1, 2) +Math.pow(n2, 2) == Math.pow(n3, 2) || Math.pow(n2, 2) + Math.pow(n3, 2) == Math.pow(n1, 2) || Math.pow(n1, 2) + Math.pow(n3, 2) == Math.pow(n2, 2)){
        if (n1 + n2 == n3 || n2 + n3 ==n1 || n1 + n3 == n2){
            System.out.println("Pythagorean Triplet");
        }else{
            System.out.println("Not Pythagorean Triplet");
        }
    }
    public static void main(String[] args) {
        pythagoreanTriplet(5,12,13);
        pythagoreanTriplet(5,12,12);
    }
}
