import java.util.Arrays;

public class SelectionSort {

   static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
                int last = arr.length - i-1; // or arr.length-(i+1)
                int maxIndex = max(arr, last);
                swap(arr, maxIndex, last);
        }
    }
   static int max(int[] arr, int end){
        int max = 0;
        for (int i = 1; i <= end; i++) {
            if (arr[max]<arr[i]){
                max = i;
            }
        }
        return  max;
   }

   static void swap(int[] arr, int first, int second){
       int temp = arr[first];
       arr[first] = arr[second];
       arr[second] = temp;
   }

    public static void main(String[] args) {
//        int[] arr = {3,2,4,1,5};
//        int[] arr = {5,4,3,2,1};
//        int[] arr = {};
//        int[] arr = {1};
        int[] arr = {-1,-4,-2,0,2,4,5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
