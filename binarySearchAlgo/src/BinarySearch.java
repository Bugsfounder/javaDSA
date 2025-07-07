
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 10;
        System.out.println(binarySearch(arr, target));
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
//        int end = arr.length;
        int end = arr.length-1;

//        while (start < end){ // if end = arr.length
        while (start<=end){
//            int mid =( start+end)/2; // might be possible that (start+end) exceeds the range of integer in java
            int mid = start + (end - start) / 2;
            if (arr[mid]==target){
                return mid;
            }
            else if (target>arr[mid]){
                start = mid+1;
//                mid = (start+end) / 2;
            }
            else{
                end = mid-1;
//                mid = (start+end)/2;
            }
        }
        return  -1;
    }
}
