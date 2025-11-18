package functions;

public class stringArgs {
    public static void main(String[] args) {
        String personalized = greet("Akshay");
        System.out.println(personalized);
    }

     static String greet(String name){
          String message = "Hello " + name;
          return message;
     }
}
