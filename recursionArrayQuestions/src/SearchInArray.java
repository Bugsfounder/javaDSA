import java.lang.reflect.Array;
import java.util.ArrayList;

public class SearchInArray {
    static int search(int[] arr, int target, int i){
        if (arr[i]==target){
            return i;
        }
        if (i==arr.length-1){
            return -1;
        }
        return search(arr, target, ++i);
    }

    static boolean isPresent(int[] arr, int target, int i){
        if (arr[i] == target){
            return true;
        }
        if (i==arr.length-1){
            return false;
        }
        return isPresent(arr, target, ++i);
    }

    static int searchFromBack(int[] arr, int target, int i) {
        if (arr[i]==target){
            return i;
        }
        if (i==0){
            return -1;
        }
        return searchFromBack(arr, target, --i);
    }

    static ArrayList<Integer> searchAllIndex(int[] arr, int target, int i , ArrayList<Integer> res){
        if (arr[i]==target){
            res.add(i);
        }
        if (i==arr.length-1){
            return res;
        }
        return searchAllIndex(arr, target, ++i, res);
    }
    public static void main(String[] args) {
        int res = search(new int[]{1,2,3,4,5}, 5, 0);
        System.out.println(res);

        System.out.println(isPresent(new int[]{1,2,3,4,5}, 0, 0));

        System.out.println(searchFromBack(new int[]{1,2,3,4,5}, 2, 4));

        ArrayList<Integer> resAll = new ArrayList<>();
        System.out.println(searchAllIndex(new int[]{1,2,3,4,5,3,2,2,4,2}, 3, 0, resAll));



    }
}
