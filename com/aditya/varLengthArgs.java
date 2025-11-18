import java.util.Arrays;
public class varLengthArgs {
    public static void main(String[] args) {
        fun(2,3, "Aditya"); //"Zero or more String arguments, collected into a String[] array called v"
    }
    static void fun(int a, int b, String...v){ //variable arg should be last in the list
          System.out.println(Arrays.toString(v)); 
    }
}
