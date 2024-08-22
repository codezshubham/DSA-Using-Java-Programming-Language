public class SelectionRecursive {
    static void selectionSort(int[] arr, int n, int i) {
        if (i > (n-1)) {
            return;
        }
        int min_index = i;
        for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[min_index]) {
                min_index = j;
            }
        }
        int temp = arr[i];
        arr[i] = arr[min_index];
        arr[min_index] = temp;

        selectionSort(arr, n, i+1);
    }

    public static void main(String[] args) {
        int[] arr = { 7, 4, 1, 2, 100, 90 };
        int n = arr.length;
        selectionSort(arr, n, 0);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
