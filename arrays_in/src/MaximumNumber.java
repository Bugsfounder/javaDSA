public class MaximumNumber {
    public static void main(String[] args) {
        int[] arr = {10, 2, 3, 4, 5};

        int maxV = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxV) {
                maxV = arr[i];
            }
        }
        System.out.println(maxV);
        // using function
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 2, 5));
    }

    // imagine that arr is not empty
    static int max(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // max b/w range
    // work on edge cases here, like array being null

    static int maxRange(int[] arr, int start, int end) {
        if (end > start) {
            return -1;
        }
        if (arr == null) {
            return -1;
        }
        int max = arr[start];
        for (int i = start; i < end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
