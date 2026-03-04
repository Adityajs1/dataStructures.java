package Recursion;

public class ntoOne{
    public static void main(String[] args) {
        ntoOne(14);
    }
    static int ntoOne(int n){
        if(n==0){
            return n;
        }
        System.out.print(n);
        return ntoOne(n-1);
    }
}