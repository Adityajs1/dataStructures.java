package Searching;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {17, 24, 34, 46, 57, 78, 79, 84, 88, 99};
        int target = 84;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
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
