public class DuplicatesRotated {
        static boolean rotated(int[] arr, int n, int target){
            int low = 0;
            int high = n - 1;
    
            while(low<=high){
                int mid = (low + high) / 2;
    
                if(arr[mid] == target){
                    return true;
                }

                if(arr[low] == arr[mid] && arr[mid] == arr[high]){
                    low = low + 1;
                    high = high - 1;
                    continue;
                }
    
                // left sorted
                if(arr[low] <= arr[mid]){
                    if(arr[low] <= target && target <= arr[mid]){
                        high = mid-1;
                    }
                    else{
                        low = mid+1;
                    }
                }
                //Right sorted
                else{
                    if(arr[mid] <= target && target <= arr[high]){
                        low = mid + 1;
                    } 
                    else{
                        high = mid - 1;
                    }
                }
            }
            return false;
        }
        public static void main(String[] args) {
            int[] arr = {3, 1, 2, 2, 3, 3, 3};
            int n = arr.length;
            int target = 3;
            boolean ans = rotated(arr, n, target);
            if(ans = false){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }
        }
    }
