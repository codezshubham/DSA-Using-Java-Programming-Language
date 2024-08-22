public class CountSort {
    
    static void countSort(int[] arr){
        int n = arr.length;
        int[] output = new int[n];

        // Find the largest element of the arr
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }

        int[] count = new int[max+1];

        // Make frequency array -> TC -> n
        for(int i = 0; i < arr.length; i++){ 
            count[arr[i]]++;
        }

        // Make prefix sum array of count array
        for(int i = 1; i < count.length; i++){ // TC -> max
            count[i] += count[i-1];
        }

        // Find the index of each element in the original array and put it in output  array
        for(int i = n-1; i >= 0; i--){ // TC -> n
            int idx = count[arr[i]] - 1;
            output[idx] = arr[i];
            count[arr[i]]--;
        }
        // copy all elements of output to arr
        for(int i = 0; i < n; i++){ // TC -> n
            arr[i] = output[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 2, 5};
        countSort(arr);

        for(int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();
    }
}