package Recursion;

public class noOfSteps {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }
    static int numberOfSteps(int num) {
        int count = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;  
            } else {
                num = num - 1; 
            }
            count++;           
        }
        return count;
    }
}
