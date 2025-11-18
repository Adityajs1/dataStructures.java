import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
    //  boolean ans = IsPrime(n);
    //  System.out.println(ans);
     in.close();
     System.out.println(IsArmstrong(n));
    }

    static boolean IsArmstrong(int n){
        int origninal = n;
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;
        }
        return sum == origninal;
    }
// goated prime no code
    static boolean IsPrime(int n){
        if(n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for(int i = 3; i * i<=n; i+=2){
           if(n % i == 0){
            return false;
           }
        }
        return true;
    }
}
