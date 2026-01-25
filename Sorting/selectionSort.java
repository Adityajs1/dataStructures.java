import java.util.Arrays;

public class selectionSort {

public static void main(String[] args) {
int[] arr = {5, 4, 3, 2, 1}; // Example array
selectionSort(arr);
System.out.println(Arrays.toString(arr));
}

static void selectionSort(int[] arr) {
for (int i = 0; i < arr.length; i++) {
// find the maximum item in the remaining array and swap with correct index
int last = arr.length - i - 1; // (12:12)
int maxIndex = getMaxIndex(arr, 0, last); // (12:45)
swap(arr, maxIndex, last); // (15:13)
}
}

static int getMaxIndex(int[] arr, int start, int end) { // (12:50)
int max = start;
for (int i = start; i <= end; i++) {
if (arr[max] < arr[i]) { // (13:27)
max = i;
}
}
return max;
}

static void swap(int[] arr, int first, int second) { // (13:41)
int temp = arr[first];
arr[first] = arr[second];
arr[second] = temp;
}
}