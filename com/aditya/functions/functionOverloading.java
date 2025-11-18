package functions;

public class functionOverloading {
    public static void main(String[] args) {
        fun(17);
        fun("Aditya");
        //fun();  this is called ambiguity, bcz it cannot decide which one to run
    }
    static void fun(int a){
        System.out.println("first one");
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println("second one");
        System.out.println(name);
    }
}
// Overlaoding is a condition when two same functions with different arguments are used 
// makes the code more cloar and intutive