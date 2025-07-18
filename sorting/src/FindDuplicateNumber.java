import java.util.ArrayList;
import java.util.List;

public class FindDuplicateNumber {
    static int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        int duplicate = -1;
        for (int j = 0; j < arr.length; j++) {
            if (j != arr[j] - 1) {
                duplicate = arr[j];
            }
        }
        return duplicate;

    }

    public static int findDuplicateVideo(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }

        return -1;
    }

    static List<Integer> findAllDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
//        int[] duplicate = new int[3];
//        i = 0;

        List<Integer> duplicate = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (j != arr[j] - 1) {
//                duplicate[i] = arr[j];
//                i++;

                duplicate.add(arr[j]);


            }
        }
        return duplicate;

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 4, 2};
//        int[] arr = {1, 1};
        int[] arr1 = {1, 1, 2, 2, 2, 3, 3};

        System.out.println(findDuplicate(arr));
        System.out.println(findAllDuplicate(arr1));
    }
}
