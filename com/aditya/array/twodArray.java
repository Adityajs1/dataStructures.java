package array;
import java.util.Scanner;

public class twodArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println(arr.length); // gives number of rows
        //input

        for(int row = 0; row < 3; row ++){
            for(int col = 0; col < arr[row].length; col++){
                   arr[row][col] = in.nextInt();
                   System.out.println(arr[row][col] + " "); 
            }
            System.out.println();
        }    
}
}