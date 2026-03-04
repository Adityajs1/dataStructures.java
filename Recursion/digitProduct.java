package Recursion;

public class digitProduct {
     public static void main(String[] args) {
        System.out.println(product(1733));
    }

    static int product(int n){
        if(n%10 == n){  // when single digit left
            return n;
        }
        return (n%10) * product(n/10);
    }
}
