import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        int a = 7;
        change(nums, a);
        System.out.println(Arrays.toString(nums));
        System.out.println(a);
    }

    static void change(int[] arr, int a) {
        arr[0] = 32;
        a = 34;
    }
}
