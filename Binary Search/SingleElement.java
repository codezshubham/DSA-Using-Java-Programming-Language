public class SingleElement {
    static int singlelement(int[] arr, int n) {
        int low = 0;
        int high = n - 1;

        if (n == 1) {
            return arr[0];
        }

        if (arr[low] != arr[low + 1]) {
            return arr[low];
        }
        if (arr[high] != arr[high - 1]) {
            return arr[high];
        }

        while (low <= high) {
            int mid = (low + high) / 2;
            low = 1;
            high = n - 2;

            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
                return arr[mid];
            }

            if (((n % 2) == 1 && arr[mid] == arr[mid - 1]) || ((n % 2) == 0) && arr[mid] == arr[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6 };
        int n = arr.length;
        int ans = singlelement(arr, n);
        System.out.println(ans);
    }
}
