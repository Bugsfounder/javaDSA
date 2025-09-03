package array.questions;

import java.util.ArrayList;
import java.util.List;

public class AddToArrayForm {
    List<Integer> addToArrayForm(int[] num, int k) {
        long n = 0;
        for(int i = 0; i<num.length; i++){
            n=(n*10)+num[i];
        }

        long intSum = n+k;
        List<Integer> res = new ArrayList<>();
        while(intSum > 0){
            long r = intSum%10;
            res.addFirst((int) r);
            intSum /= 10;
        }

        return res;
    }

//    public List<Integer> addToArrayForm2(int[] num, int k) {
//
//    }
    public static void main(String[] args){
        AddToArrayForm ad = new AddToArrayForm();
//        System.out.println(ad.addToArrayForm(new int[]{2,7,4}, 181));
//        System.out.println(ad.addToArrayForm(new int[]{1,2,0,0}, 34));
//        System.out.println(ad.addToArrayForm(new int[]{2,1,5}, 806));
//        System.out.println(ad.addToArrayForm(new int[]{9,9,9,9,9,9,9,9,9,9}, 1));
//        System.out.println(ad.addToArrayForm2(new int[]{9,9,9,9,9,9,9,9,9,9}, 1));
        System.out.println(ad.addToArrayForm(new int[]{1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3}, 516));
//        System.out.println(ad.addToArrayForm2(new int[]{1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3}, 516));
    }

}
