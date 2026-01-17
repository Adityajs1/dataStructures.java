package Searching;

public class searchInMountainArray {
    public static void main(String[] args) {
        
    }

    int search(int[] arr, int target){
        int peak = peakMountainIndexArray(arr);
        int firstTry = orderAgnosticsBS(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }
        return orderAgnosticsBS(arr, target, peak + 1, arr.length -1);
    }

    public int peakMountainIndexArray(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid + 1]){
                // you are in the decr part of the array
                // this may be the ans, but we'll look at the left
                end = mid;
            }else{
                // you are in asc part
               start = mid + 1;
            }
        }
        return start;
    }

        static int orderAgnosticsBS(int[] arr, int target, int start, int end){
         
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
