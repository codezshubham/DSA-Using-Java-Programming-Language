import java.util.*;
public class MinRotated {
    static int minimum(int[] arr, int n){
        int low = 0;
        int high = n-1;
        int ans = Integer.MAX_VALUE;
        while(low<=high){
            int mid = (low + high) / 2;

            if(arr[low] <= arr[mid]){
                ans = Math.min(ans, arr[low]);
                low = mid + 1;
            }
            else{
                ans = Math.min(ans, arr[mid]);
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 01, 2, 3};
        int n = arr.length;
        int temp = minimum(arr, n);
        System.out.println(temp);
    }
}
