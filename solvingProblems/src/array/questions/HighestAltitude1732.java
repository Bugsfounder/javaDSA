package array.questions;

public class HighestAltitude1732 {
    public int largestAltitude(int[] gain) {
        int alt = 0;
        int prev = 0;
        for(int i = 0; i < gain.length; i++){
            prev += gain[i];

            if (prev > alt){
                alt = prev;
            }
        }
        return alt;
    }
    public static void main(String[] args){
//        int[] arr = new  int[]{-4,-3,-2,-1,4,3,2};
//        int[] arr = new  int[]{-5,1,5,0,-7};
//        int[] arr = new  int[]{1};
//        int[] arr = new  int[]{-1};
//        int[] arr = new  int[]{-1,-1,-1,-1};
        int[] arr = new  int[]{52,-91,72};
//        int[] arr = new  int[]{};
        HighestAltitude1732 h = new HighestAltitude1732();
        System.out.println(h.largestAltitude(arr));
    }
}
