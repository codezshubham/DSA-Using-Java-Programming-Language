public class BinarySearch{
    static int binarySearch(int[] arr, int n, int target){
        int low = 0;
        int high = n-1;

        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 7, 9, 12, 16, 17}; // sorted array
        int n = arr.length;
        int target = 6;
        int index = binarySearch(arr, n, target);

        if(index == -1){
            System.out.println("The Element Is Not Present");
        }
        else{
            System.out.println("The Element Is present at index : " + index);
        }

    }
}