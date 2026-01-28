import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FIZZBUZZ");
        } if (num % 3 == 0) {
            System.out.println("FIZZ");
        } if (num % 5 == 0) {
            System.out.println("BUZZ");
        } else {
            System.out.println(num);
        }

        sc.close();
    }
}


