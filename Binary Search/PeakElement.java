public class PeakElement {
    static int peakelement(int[] arr, int n){
        int low = 0;
        int high = n - 1;

        if(n==1){
            return arr[0];
        }
        if((low == 0) && arr[low] > arr[low+1]){
            return low;
        }
        if((high == (n-1)) && arr[high] > arr[high-1]){
            return high;
        }

        while(low<=high){
            int mid = (low + high) / 2;
            low = 1;
            high = n - 2;

            if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]){
                return mid;
            }

            else if(arr[mid] > arr[mid-1]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 5, 1};
        int n = arr.length;
        int ans = peakelement(arr, n);
        System.out.println(ans);
    }
}
