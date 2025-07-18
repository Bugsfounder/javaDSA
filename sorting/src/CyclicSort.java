import java.util.Arrays;

public class CyclicSort {
    // tried myself
    static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
//            if (i != arr[i] - 1) { // not more better
            if (arr[i] != arr[arr[i] - 1]) {
                swap(arr, i, arr[i] - 1);
            } else {
                i++;
            }
        }
    }

    // from video
    static void cyclicSortVideo(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctInd = arr[i] - 1;
            if (arr[i] != arr[correctInd]) {
                swap(arr, i, correctInd);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        // when to use: when given nos. from range 1 to N --> use cyclic sort
//        int[] arr = {3, 2, 4, 1, 6};
//        int[] arr = {3, 2, 4, 6, 1}; // not work , it has to be in range 1 to n where n is length of the array, or may be n-1;
        int[] arr = {3, 5, 2, 1, 4};


//        cyclicSort(arr);
        cyclicSortVideo(arr);
        System.out.println(Arrays.toString(arr));

    }
}
