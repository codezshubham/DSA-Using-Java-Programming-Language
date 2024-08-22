public class Min_HeapSort {
        public void sort(int arr[]) {
            int N = arr.length;
    
            // Build min heap (rearrange array)
            for (int i = N / 2 - 1; i >= 0; i--)
                heapify(arr, N, i);
    
            // One by one extract an element from heap
            for (int i = N - 1; i > 0; i--) {
                // Move current root to end
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;
    
                // call min heapify on the reduced heap
                heapify(arr, i, 0);
            }
        }
    
        // To heapify a subtree rooted with node i which is
        // an index in arr[]. n is size of heap
        void heapify(int arr[], int N, int i) {
            int smallest = i; // Initialize smallest as root
            int l = 2 * i + 1; // left = 2*i + 1
            int r = 2 * i + 2; // right = 2*i + 2
    
            // If left child is smaller than root
            if (l < N && arr[l] < arr[smallest])
                smallest = l;
    
            // If right child is smaller than smallest so far
            if (r < N && arr[r] < arr[smallest])
                smallest = r;
    
            // If smallest is not root
            if (smallest != i) {
                int swap = arr[i];
                arr[i] = arr[smallest];
                arr[smallest] = swap;
    
                // Recursively heapify the affected sub-tree
                heapify(arr, N, smallest);
            }
        }
    
        static void printArray(int arr[]) {
            int N = arr.length;
    
            for (int i = 0; i < N; ++i)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
    
        public static void main(String args[]) {
            int arr[] = { 12, 11, 13, 5, 6, 7 };
    
            Min_HeapSort ob = new Min_HeapSort();
            ob.sort(arr);
    
            System.out.println("Sorted array is");
            printArray(arr);
        }
    }
