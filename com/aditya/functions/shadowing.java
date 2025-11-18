package functions;

public class shadowing {
    static int x = 90;     //static variable
    public static void main(String[] args) {
      System.out.println(x);
      int x = 40;
      System.out.println(x);
      fun();
    }
    static void fun(){
        System.out.println(x); // this one will refer to the shadowed x on line 4
    }
}
// A local variable shadows a static/instance variable only within the block where it is declared.
// It does not affect other methods, even if they are called from within that block.