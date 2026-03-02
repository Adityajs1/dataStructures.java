package Recursion;

public class powerOfThree {
     public static void main(String[] args) {
        System.out.println(isPowerOfThree(45));
    }
    static boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        while (n % 2 == 0) {
            n = n / 2;
        }
        return n == 1;
    }
}
