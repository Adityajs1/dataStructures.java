package Recursion;

public class sortRec {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 5};
        System.out.println(sorted(arr, 0)); 

        int[] arr2 = {1, 2, 3, 5};
        System.out.println(sorted(arr2, 0)); 
    }

    static boolean sorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        return sorted(arr, index + 1);
    }
}