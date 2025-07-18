import java.util.Arrays;

public class SetMismatch {

    static int[] findDuplicateAndMissing(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        int[] duplicate = new int[2];
        for (int j = 0; j < arr.length; j++) {
            if (j != arr[j] - 1) {
                duplicate[0] = arr[j];
            }

            if (j != arr[j] - 1) {
                duplicate[1] = j + 1;
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
//        int[] arr = {1, 4, 3, 5, 5};
//        int[] arr = {1, 2, 2, 4};
        int[] arr = {1, 1};
        int[] res = findDuplicateAndMissing(arr);
        System.out.println(Arrays.toString(res));
    }
}
