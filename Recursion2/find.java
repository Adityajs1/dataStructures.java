package Recursion2;

public class find {
    public static void main(String[] args) {
        int[] arr = {131, 42, 44,121};
        System.out.println(linSearch(arr, 44, 0));
    }
    static boolean linSearch(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }

        return arr[index] == target || linSearch(arr, target, index+1);

    }
}
