import java.util.ArrayList;

public class sumSubarray {
    public static void main(String[] args) {
        int[] arr = {2, 5, 4, 3, 7, 6, 9, 8};
        System.out.println(sumSubArray(arr, 0, 4));
    }
    static ArrayList sumSubArray(int [] arr, int start , int k){
        start = 0;
        int sum = 0;
        ArrayList<Integer> result= new ArrayList<>();

        for(int end = start; end < arr.length ; end ++){
            if(end < k ){
                sum += arr[end];
            }
            if(end >= k){
              
               sum -= arr[start];
               sum += arr[end];
               start++;
            }
             result.add(sum);
        }
        return result;

    }
}
