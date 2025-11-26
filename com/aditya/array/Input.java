package array;
import java.util.Scanner;
import java.util.Arrays;

// Input in an array using loops

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++){   // returns the number stored in  the array [11, 12, 13, 14, 15]
           arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));


        for(int i = 0; i < arr.length; i++){     
            System.out.println(arr[i]);     // give the elements by the keyboard differed by a line
        }


        for(int num : arr){
            System.out.println(num + " ");  // give the same output as the prev
        }
        in.close();
    }
}
