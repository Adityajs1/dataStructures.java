package array;
import java.util.Arrays;

public class passingFunc {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr);  // this will print the memory address of the array, not its contents [I@251a69d7 , it means an array of int
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0] = 17;
    }
}
