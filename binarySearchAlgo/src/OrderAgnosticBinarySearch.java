public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] arr1 = {10,9,8,7,6,5,4,3,2,1};
        int target = 10;
        System.out.println(search(arr, target));
        System.out.println(search(arr1, target));
    }

   static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        // check whether the array is sorted in ascending or descending order
       boolean isAsc = arr[start]<arr[end];

//       if (arr[start] < arr[end]){
//           isAsc= true;
//       }
       while (start <= end) {
           int mid = start + (end - start) / 2;
            // 1 2 3 4 --> 4 // for reference
           if (arr[mid] == target){
               return mid;
           }
           if  (isAsc){
               if (arr[mid] < target){
                   start = mid +1;
               }else{
                   start = mid -1;
               }
           }else{
               // 4 3 2 1 --> 1 // for reference
               if (arr[mid] > target){
                   start = mid +1;
               }else {
                   start = mid -1;
               }
           }
       }
       return -1;
   }
}
