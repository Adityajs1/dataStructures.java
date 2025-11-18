package functions;

public class scoping {
    public static void main(String[] args) {
        String name = "Aditya";
        //when you define a var inside a func, u can only access those var. in that func only
        {
            name = "Chandan";   
        }
        System.out.println(name); // Chandan
    }
}
 // Anything that is outside you can use it inside,
// you can initialise it though, the outside doesn't know it exists but not vice-versa
        