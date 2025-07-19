import java.util.ArrayList;
import java.util.List;

public class MissingValuesEasy {
    // tried myself
    public static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
//            if (nums[i] >= nums.length) {
//                i++;
//            } else
            if (nums[i] < nums.length && nums[i] != nums[nums[i]]) {
                swap(nums, nums[i], i);
            } else {
                i++;
            }
        }

        for (int j = 0; j <= nums.length; j++) {
//  /   /       if (j >= nums.length) {
//                return nums.length;
//            }
            if (j != nums[j]) {
                return j;
            }
        }
        return nums.length;
    }

    // tried myself
    public static List<Integer> missingNumberAll(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
//            if (nums[i] >= nums.length) {
//                i++;
//            } else
            if (nums[i] < nums.length && nums[i] != nums[nums[i]]) {
                swap(nums, nums[i], i);
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (j != nums[j]) {
                res.add(j);
            }
        }
//        res.add(nums.length);

        return res;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
//        int[] arr = {3, 0, 1};
//        int[] arr = {0, 1};
//        int[] arr = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};

        int res = missingNumber(arr);
        List<Integer> res1 = missingNumberAll(arr);
        System.out.println(res1);
    }
}

/*
take the index of minimum number
then start searching for max number after this index
then return max - min
 */
