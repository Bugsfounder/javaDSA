import java.util.ArrayList;
// this approach is not recommended bcause on each call it is creating new Arraylist object
public class ReturnListWithoutArgumentPassing {

    static ArrayList<Integer> searchAll(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if (arr[index] == target){
            list.add(index);
        }
        if (index == arr.length-1){
            return list;
        }
        ArrayList<Integer> answerFromBelowCalls = searchAll(arr, target, ++index);

        list.addAll(answerFromBelowCalls);
        return list;
    }
    public static void main(String[] args) {

        System.out.println(searchAll(new int[]{1,2,3,4,5,4,5,6}, 4, 0));
    }
}
