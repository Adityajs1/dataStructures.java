package Searching;

public class orderAgnosticsBS {
    public static void main(String[] args) {
        int[] arr = { 91,89, 77, 69, 64, 61, 52, 27, 16,14, 9};
        int target = 27;
        int ans = orderAgnosticsBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticsBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
         
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start)/2;
            
            if(target == arr[mid]){
                return mid;
            }

            if(isAsc){
              if(target < arr[mid]){
                end = mid - 1;
              }
              else{
                start = mid + 1;
              }
            }
            else{
              if(target > arr[mid]){
                end = mid - 1;
              }
              else{
                start = mid + 1;
              }  
            }
            
        }
        return -1;
    }
}
