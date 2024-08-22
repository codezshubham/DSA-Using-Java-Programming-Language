public class QuickRecursive {

    static void printArray(int[] A, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(A[i] + " ");
        }
    }

    static int partition(int A[], int low, int high) {
        int pivot = A[low];
        int i = low + 1;
        int j = high;
        int temp;

        while (i < j){
            while (A[i] <= pivot) {
                i++;
            }

            while (A[j] > pivot) {
                j--;
            }

            if (i < j) {
                temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }

        // Swap A[low] and A[j]
        temp = A[low];
        A[low] = A[j];
        A[j] = temp;
        return j;
    }

    static void quickSort(int A[], int low, int high) {
        int partitionIndex; // Index of pivot after partition
        if (low >= high) {
            return;
        }
        partitionIndex = partition(A, low, high);
        quickSort(A, low, partitionIndex - 1); // sort left subarray
        quickSort(A, partitionIndex + 1, high); // sort right subarray
    }

    public static void main(String[] args) {
        int[] A = { 9, 4, 4, 8, 7, 5, 6 };
        int n = A.length;
        quickSort(A, 0, n - 1);
        printArray(A, n);

    }
}

// import java.util.*;

// class Solution {
//     static int partition(List<Integer> arr, int low, int high) {
//         int pivot = arr.get(low);
//         int i = low;
//         int j = high;

//         while (i < j) {
//             while (arr.get(i) <= pivot && i <= high - 1) {
//                 i++;
//             }

//             while (arr.get(j) > pivot && j >= low + 1) {
//                 j--;
//             }
//             if (i < j) {
//                 int temp = arr.get(i);
//                 arr.set(i, arr.get(j));
//                 arr.set(j, temp);
//             }
//         }
//         int temp = arr.get(low);
//         arr.set(low, arr.get(j));
//         arr.set(j, temp);
//         return j;
//     }

//     static void qs(List<Integer> arr, int low, int high) {
//         if (low < high) {
//             int pIndex = partition(arr, low, high);
//             qs(arr, low, pIndex - 1);
//             qs(arr, pIndex + 1, high);
//         }
//     }
//     public static List<Integer> quickSort(List<Integer> arr) {
//         // Write your code here.
//         qs(arr, 0, arr.size() - 1);
//         return arr;
//     }
// }

// public class tUf {
//     public static void main(String args[]) {
//         List<Integer> arr = new ArrayList<>();
//         arr = Arrays.asList(new Integer[] {4, 6, 2, 5, 7, 9, 1, 3});
//         int n = arr.size();
//         System.out.println("Before Using insertion Sort: ");
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr.get(i) + " ");
//         }
//         System.out.println();
//         arr = Solution.quickSort(arr);
//         System.out.println("After insertion sort: ");
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr.get(i) + " ");
//         }
//         System.out.println();
//     }
// }