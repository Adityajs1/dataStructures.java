package Searching;

public class mountainArray {
    public static void main(String[] args) {
        
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
}
