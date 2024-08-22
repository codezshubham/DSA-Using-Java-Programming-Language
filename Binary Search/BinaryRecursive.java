public class BinaryRecursive {
    static int binarySearch(int[] arr, int low, int high, int target){

        // base condition
        if(low > high){
            return -1;
        }

        int mid = (low + high) / 2;

        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid] > target){
            return binarySearch(arr, low, mid-1, target);
        }
        else{
            return binarySearch(arr, mid+1, high, target);
        }

    }
    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 7, 9, 12, 16, 17};
        int n = arr.length;
        int target = 6;
        int low = 0;
        int high = n-1;

        int index = binarySearch(arr, low, high, target);
        if(index == -1){
            System.out.println("The Element Is Not Present");
        }
        else{
            System.out.println("The element is present at :" + index);
            }
    }
}
