import java.util.*;
public class CeilNo {
    static int lowerBound(int[] arr, int n, int x){
        int low = 0;
        int high = n-1;
        int ans = n;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] >= x){
                ans = arr[mid];
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you wanna find it's Ceil No : ");
        int x = sc.nextInt();
        int temp = lowerBound(arr, n, x);
        System.out.println(temp);
    }
}

