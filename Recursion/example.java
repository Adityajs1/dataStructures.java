package Recursion;
public class example {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        System.out.println(n);
        print1(2);
    }
     static void print1(int n){
        System.out.println(n);
        print2(3);
    }
     static void print2(int n){
        System.out.println(n);
        print3(4);
    }
     static void print3(int n){
        System.out.println(n);
        prin4(5);
    }
     static void prin4(int n){
        System.out.println(n);
    }
}