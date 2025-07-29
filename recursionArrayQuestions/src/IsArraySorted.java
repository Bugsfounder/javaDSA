
public class IsArraySorted {
    static boolean isSorted(int[] arr, int i){
        if (i==arr.length-1){
            return true;
        }else if (arr[i] < arr[i+1] && isSorted(arr, ++i)){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isSorted(new int[]{1,2,5,4,5}, 0));
    }
}
