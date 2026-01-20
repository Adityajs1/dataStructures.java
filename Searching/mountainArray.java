package Searching;

public class mountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 7, 4, 2};
        mountainArray obj = new mountainArray();
        int ans = obj.peakMountainIndexArray(arr);
        System.out.println("Peak is at index: " + ans);
        System.out.println("Peak value is: " + arr[ans]);
    }

    public int peakMountainIndexArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){  // Changed from start <= end
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
                // We're on descending side or at peak
                end = mid;
            } else {
                // We're on ascending side
                start = mid + 1;  // Changed from end = mid + 1
            }
        }
        return start;
    }
}
