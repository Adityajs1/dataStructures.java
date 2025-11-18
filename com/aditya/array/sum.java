package array;

public class sum {
    public static void main(String[] args) {
        int[] numbers = {12, 17, 15,23};
        int sum = 0;

       for (int i = 0; i < numbers.length; i ++){
       sum += numbers[i];
       System.out.println(sum);
       }
       
    }
}
