package Recursion;

public class reverseDigits {
     static int reverse(int num, int reversed) {
        if (num == 0) return reversed;
        return reverse(num / 10, reversed * 10 + num % 10);
    }

    public static void main(String[] args) {
        int num = 98765;
        System.out.println(reverse(num, 0));
    }
}
