
import java.util.*;
public class TimesRotated{
    public static int findKRotation(int[] arr) {
        int low = 0, high = arr.length - 1;
        int ans = Integer.MAX_VALUE;
        int index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            //search space is already sorted
            //then arr[low] will always be
            //the minimum in that search space:
            if (arr[low] <= arr[high]) {
                if (arr[low] < ans) {
                    index = low;
                    ans = arr[low];
                }
                break;
            }

            //if left part is sorted:
            if (arr[low] <= arr[mid]) {
                // keep the minimum:
                if (arr[low] < ans) {
                    index = low;
                    ans = arr[low];
                }

                // Eliminate left half:
                low = mid + 1;
            } else { //if right part is sorted:

                // keep the minimum:
                if (arr[mid] < ans) {
                    index = mid;
                    ans = arr[mid];
                }

                // Eliminate right half:
                high = mid - 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 0, 1, 2};
        int ans = findKRotation(arr);
        System.out.println("The array is rotated " + ans + " times.");
    }
}

// import java.util.*;
// public class TimesRotated {
//     static int minimum(int[] arr, int n){
//         int low = 0;
//         int high = n-1;
//         int index = -1;
//         int ans = Integer.MAX_VALUE;
//         while(low<=high){
//             int mid = (low + high) / 2;

//             if(arr[low] <= arr[high]){
//                 ans = Math.min(ans, arr[low]);
//                 index = low;
//                 break;
//             }
//             if(arr[low] <= arr[mid]){
//                 ans = Math.min(ans, arr[low]);
//                 index = low;
//                 low = mid + 1;
//             }
//             else{
//                 ans = Math.min(ans, arr[mid]);
//                 index = mid;
//                 high = mid - 1;
//             }
//         }
//         return index;
//     }

//     public static void main(String[] args) {
//         int[] arr = {3, 4, 5, 6, 7, 0, 1, 2};
//         int n = arr.length;
//         int temp = minimum(arr, n);
//         System.out.println(temp);
//     }
// }


