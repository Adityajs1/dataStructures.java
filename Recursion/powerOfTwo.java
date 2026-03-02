package Recursion;

public class powerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(45));
    }
    static boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        while (n % 2 == 0) {
            n = n / 2;
        }
        return n == 1;
    }

}