package Recursion;

import java.util.ArrayList;

public class dupLin {
    public static void main(String[] args) {
        int[] arr = {3, 7, 3, 9, 3};
        int target = 3;
        ArrayList<Integer> result = new ArrayList<>();
        linearSearch(arr, 0, target, result); 
        System.out.println(result); 
    }
    static void linearSearch(int[] arr, int index, int target, ArrayList<Integer> result) {
    if (index == arr.length) {
        return;
    }
    if (arr[index] == target) {
        result.add(index);
    }
    linearSearch(arr, index + 1, target, result);
}
}
