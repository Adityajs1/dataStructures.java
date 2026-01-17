package revisitConcepts.functions;

public class reference {
    public static void main(String[] args) {
    String naam = "Ankit";
    changeName(naam);  // strings cannot be modified
    System.out.println(naam);
   }
   static void changeName(String name){
    name = "Aditya";
   }
}
