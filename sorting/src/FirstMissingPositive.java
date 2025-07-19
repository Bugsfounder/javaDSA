public class FirstMissingPositive {
    public static int missingPositiveNumber(int[] nums) {
        int i = 0;
        while (i < nums.length && nums[i] > 0) {
            if (nums[i] != nums[nums[i]]) {
                swap(nums, i, nums[i] - 1);
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != (j + 1)) {
                return j + 1;
            }
        }
        return nums.length;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0};
//        int[] arr = {3, 4, -1, 1};

        System.out.println(missingPositiveNumber(arr));
    }
}
