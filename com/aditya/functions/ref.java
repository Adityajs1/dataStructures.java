package functions;

public class ref {
   public static void main(String[] args) {
    String naam = "Ankit";
    changeName(naam);  // strings cannot be modified
    System.out.println(naam);
   }
   static void changeName(String name){
    name = "Aditya";
   }
}
//mplemented a simple example to show how Java handles method arguments using pass-by-value.
//In the demo, a String variable (name) is passed to a method that reassigns the parameter to a new value ("Rahul").
//Since Java passes a copy of the reference and String objects are immutable, the original variable in main() remains unchanged ("Ankit").
//This illustrates that reassigning a method parameter does not modify the caller’s variable.