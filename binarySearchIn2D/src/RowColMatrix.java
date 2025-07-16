import java.util.Arrays;

public class RowColMatrix {

    public static int[] searchInMatrix(int[][] arr, int target) {
        int row = 0;
        int col = arr.length-1;

        while (row < arr.length && col < arr[0].length && col >= 0){
            if (arr[row][col] == target){
                return new int[]{row, col};
            }
            if (arr[row][col] < target){
                row++;
            }else{
                col --;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
//        int[][] arr = {{10,20,30,40},{15,25,35,45},{20,29,37,49},{33,34,38,50}};
        int[][] arr = {{10,20,30,40},{15,25,35,45},{20,29,37,49}};

        int target = 20;

        System.out.println(Arrays.toString(searchInMatrix(arr, target)));
    }
}
