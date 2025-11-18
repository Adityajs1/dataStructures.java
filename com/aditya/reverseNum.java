public class reverseNum{
    public static void main(String[] args) {
       int num = 83749893;
       int ans = 0;
       while(num > 0){
        int rem = num % 10;
        num = num /10;
        ans = ans*10 + rem;
       }
       System.out.println(ans);
    }
}