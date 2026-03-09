import java.util.ArrayList;

public class sub {
    public static void main(String[] args) {
        int[] arr = {2, 5, 4, 3, 7, 6, 9, 8};
        int k = 4;

        ArrayList<Integer> sums = sumSubArray(arr, 0, k);
        System.out.println("All subarray sums: " + sums);
        System.out.println("Max subarray sum: " + getMax(sums));
    }

    static ArrayList<Integer> sumSubArray(int[] arr, int start, int k) {
        start = 0;
        int sum = 0;
        ArrayList<Integer> result = new ArrayList<>();

        for (int end = start; end < arr.length; end++) {
            if (end < k) {
                sum += arr[end];
            }
            if (end >= k) {
                sum -= arr[start];
                sum += arr[end];
                start++;
            }
            result.add(sum);
        }
        return result;
    }

    static int getMax(ArrayList<Integer> result) {
        int max = result.get(0);
        for (int sum : result) {
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
