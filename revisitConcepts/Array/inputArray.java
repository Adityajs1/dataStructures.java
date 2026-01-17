package revisitConcepts.Array;
import java.util.Arrays;
import java.util.Scanner;

public class inputArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i = 0; i < arr.length; i ++){
           arr[i] = input.nextInt();
        }
       System.out.println(Arrays.toString(arr));

    //    for(int i = 0; i < arr.length; i ++){
    //     System.out.println(arr[i]);
    //    }
    }
}
