public class repeatNums {
    public static void main(String[] args) {
        int n = 1222;
        int count = 0;
        while(n>0){
            int rem = n %10;
            if (rem == 2){
                count ++;
            }
            n = n/10; 
        }
        System.out.println(count);
    }
}
