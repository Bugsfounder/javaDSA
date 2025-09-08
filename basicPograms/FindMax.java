package basicPograms;

public class FindMax {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 43, 23, 65, 23, 9 };
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int element : arr) {
            if (element > max) {
                max = element;
            }
            if (element < min) {
                min = element;
            }
        }

        System.out.println(max);
        System.out.println(min);
    }
}
