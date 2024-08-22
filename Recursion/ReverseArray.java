import java.util.*;
public class ReverseArray {
    static void reverse(int[] arr, int start, int end){
        if(start < end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(arr, start + 1, end - 1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        reverse(arr, 0, (n - 1));
        // for(int i=0; i<n; i++){
        //     System.out.print(arr[i] + " ");
        // }
        System.out.println(Arrays.toString(arr));
    }
}
