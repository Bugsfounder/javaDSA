import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 3, 5, 2, 5, 6, 5};
//        int[] sortedArr = mergeSort(arr, 0, arr.length - 1);
        int[] sortedArr = mergeSort(arr);
        System.out.println(Arrays.toString(sortedArr));

        System.out.println(Arrays.toString(merge(new int[]{1, 2, 3}, new int[]{4, 5, 6, 7})));
    }

    public static int[] mergeSort(int[] unsortedArr) {
        int mid = (unsortedArr.length - 1) / 2;
        int[] arr1 = Arrays.copyOfRange(unsortedArr, 0, mid + 1);
        int[] arr2 = Arrays.copyOfRange(unsortedArr, mid + 1, unsortedArr.length);

        if (unsortedArr.length <= 1) {
            return unsortedArr;
        }

        int[] s1 = mergeSort(arr1);
        int[] s2 = mergeSort(arr2);

        return merge(s1, s2);
    }

    static int[] merge(int[] arr1, int[] arr2) {
        int i = 0, j = 0, k = 0;
        int[] sortedArray = new int[arr2.length + arr1.length];

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                sortedArray[k] = arr1[i];
                k++;
                i++;
            }
            if (i < arr1.length) {

                if (arr2[j] <= arr1[i]) {
                    sortedArray[k] = arr2[j];
                    k++;
                    j++;
                }
            }
        }

        if (i < arr1.length) {
            while (i < arr1.length) {
                sortedArray[k] = arr1[i];
                i++;
                k++;
            }
        }
        if (j < arr2.length) {
            while (j < arr2.length) {
                sortedArray[k] = arr2[j];
                j++;
                k++;
            }
        }
        return sortedArray;
    }

}
