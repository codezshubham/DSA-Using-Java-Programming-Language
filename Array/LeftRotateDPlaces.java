public class LeftRotateDPlaces {
        static void leftRotate(int arr[], int n, int d) {
    
            if (n == 0) return;

            d = d % n;
    
            if (d == 0) return;
    
            int[] temp = new int[d]; 
    
            for (int i = 0; i < d; i++) {
                temp[i] = arr[i];
            }
    
            for (int i = d; i < n; i++) {
                arr[i - d] = arr[i];
            }
    
            for (int i = n - d; i < n; i++) {
                arr[i] = temp[i - (n - d)];
            }
        }
        public static void main(String args[]) {
            int n = 7;
            int arr[] = {1, 2, 3, 4, 5, 6, 7};
            int d = 3;
    
            System.out.println("Before rotation:");
            for (int i = 0; i < n; i++)
                System.out.print( arr[i] + " ");
            System.out.println();
    
            leftRotate(arr, n, d);
            System.out.println("After rotation:");
            for (int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
    
    }
