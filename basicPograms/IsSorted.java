package basicPograms;

public class IsSorted {
    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3, 22, 4, 52, 13, 25, 12 };
        int[] arr = { 1, 2, 3, 4 };

        boolean isSorted = true;

        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
            }
        }

        System.out.println(isSorted);
    }
}
