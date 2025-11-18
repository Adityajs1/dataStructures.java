package functions;

public class args {
    public static void main(String[] args) {
        int result = sum(3, 31);
        System.out.println(result);
    }

    static int sum(int a, int b){
        int sum = a + b;
        return sum;
    }
}
