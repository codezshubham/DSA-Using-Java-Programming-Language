import java.util.*;
public class BubbleRecursive {
    static void bubble(int[] arr, int n){
        if(n==1){
            return;
        }
        for(int j=0; j<n-1; j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        bubble(arr, n-1);
        }
    public static void main(String[] args) {
        int[] arr = {5, 7, 4, 3, 1};
        int n = arr.length;
        bubble(arr, n);
        System.out.println(Arrays.toString(arr));
    }
}
