public class MergeRecursive {
    static void merge(int[] arr, int low, int mid, int high){
        int n = high - low + 1;
        int i, j, k;
        i = low;
        j = mid+1;
        k = low;
        int[] b = new int[n];

        while(i<=mid && j<=high){
            if(arr[i] <= arr[j]){
                b[k] = arr[i];
                i++;
                k++;
            }
            else{
                b[k] = arr[j];
                j++;
                k++;
            }
            
        }
        while(i<=mid){
            b[k] = arr[i];
            i++;
            k++;
        }
        
        while(j<=high){
            b[k] = arr[j];
            j++;
            k++;
        }

        for(int x=low; x<=high; x++){
            arr[x] = b[x]; 
        }
    }

    static void mergeSort(int[] arr, int low, int high){
        if(low>=high){
            return;
        }
        else{
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            merge(arr, low, mid, high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {7, 15, 2, 8, 10};
        int n = arr.length;
        mergeSort(arr, 0, n-1);
        for(int val : arr){
            System.out.println(val);
        }
    }
}

// import java.util.*;

//
//     private static void merge(int[] arr, int low, int mid, int high) {
//         ArrayList<Integer> temp = new ArrayList<>(); // temporary array
//         int left = low;      // starting index of left half of arr
//         int right = mid + 1;   // starting index of right half of arr

//         //storing elements in the temporary array in a sorted manner//

//         while (left <= mid && right <= high) {
//             if (arr[left] <= arr[right]) {
//                 temp.add(arr[left]);
//                 left++;
//             } else {
//                 temp.add(arr[right]);
//                 right++;
//             }
//         }

//         // if elements on the left half are still left //

//         while (left <= mid) {
//             temp.add(arr[left]);
//             left++;
//         }

//         //  if elements on the right half are still left //
//         while (right <= high) {
//             temp.add(arr[right]);
//             right++;
//         }

//         // transfering all elements from temporary to arr //
//         for (int i = low; i <= high; i++) {
//             arr[i] = temp.get(i - low);
//         }
//     }

//     public static void mergeSort(int[] arr, int low, int high) {
//         if (low >= high) return;
//         int mid = (low + high) / 2 ;
//         mergeSort(arr, low, mid);  // left half
//         mergeSort(arr, mid + 1, high); // right half
//         merge(arr, low, mid, high);  // merging sorted halves
//     }
// 
// public class MergeRecursive {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = 7;
//         int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
//         System.out.println("Before sorting array: ");
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//         Solution.mergeSort(arr, 0, n - 1);
//         System.out.println("After sorting array: ");
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

// }