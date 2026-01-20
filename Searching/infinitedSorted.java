package Searching;

public class infinitedSorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 24, 35, 56, 67, 78, 89, 677, 677, 699};
        int target = 56;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target){
        //first find the range
        //start searching with a box value of 2
        int start = 0;
        int end = 1;

        while (end < arr.length && target > arr[end]) {
            int newStart = end + 1;
            // keep doubling the box size
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        if (end >= arr.length) {
            end = arr.length - 1;
        }

        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
