package Recursion;

public class onetoN {
    public static void main(String[] args) {
        onetoN(14);
    }
    public static void onetoN(int n){
        if(n==0){
            return;
        }
         onetoN(n-1);
        System.out.print(n);
    }
}
