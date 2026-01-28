import java.util.Arrays;

public class insertionSort {

      public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    
   static void insertion(int[] arr) {
    // arr: [3, 4, 5, 1, 2]
    
    for (int i = 1; i < arr.length; i++) {
        // i = 1: arr: [3, 4, 5, 1, 2]
        // i = 2: arr: [3, 4, 5, 1, 2]
        // i = 3: arr: [3, 4, 5, 1, 2]
        // i = 4: arr: [1, 3, 4, 5, 2]
        
        for (int j = i; j > 0; j--) {
            // When i=3, j starts at 3
            // j=3: compare arr[3]=1 with arr[2]=5
            // j=2: compare arr[2]=1 with arr[1]=4
            // j=1: compare arr[1]=1 with arr[0]=3
            
            if (arr[j] < arr[j-1]) {
                // If current element is smaller than previous
                swap(arr, j, j-1);
            } else {
                // If we find an element that's smaller or equal, stop
                break;
            }
        }
    }
}

static void swap(int[] arr, int first, int second) {
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
}
    
  
}