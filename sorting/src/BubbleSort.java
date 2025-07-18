import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        boolean swap = false;
        for (int i = 0; i < arr.length; i++){
            for (int j = 1; j < arr.length - i; j++ ){
                if(arr[j - 1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] =temp;
                    swap = true;
                }

            }
                if (!swap){ // !false = true
                    break;
                }
        }
    }

    static void bubbleSortFromVideo(int[] arr){

        boolean swapped;
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step, max item will come at the last respective index;
            for (int j = 1; j < arr.length-i; j++) {
                // swap if the item is smaller than the previous item;
                if (arr[j] < arr[j-1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }

                // if you did not swap for a particular value if i, it means the array is sorted hence stop the program
                if (!swapped) break;
            }

        }
    }
    public static void main(String[] args) {
//        int[] arr = {2,3,1,4,5};
        int[] arr = {1,2,3,4,5};

        bubbleSort(arr);
//        bubbleSortFromVideo(arr);
        System.out.println(Arrays.toString(arr));

    }
}
