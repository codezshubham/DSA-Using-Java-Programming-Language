import java.util.Scanner;

public class UpperBound {
     static int upperBound(int[] arr, int n, int x){
        int low = 0;
        int high = n-1;
        int ans = n;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] > x){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 15, 19, 19, 19};
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you wanna find it's lower bound");
        int x = sc.nextInt();
        int temp = upperBound(arr, n, x);
        System.out.println(temp);
    }
}
