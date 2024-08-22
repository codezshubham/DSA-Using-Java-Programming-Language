
import java.util.Scanner;
public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declare and Create a new array
        int[] arr = new int[5];

        // Declaring and Initializing a new array
        int [] arr2 = {1, 2, 3, 4, 5};

        // Taking Input In Array
        for(int i=0; i<arr.length; i++){
           arr[i] = sc.nextInt();
        }

        // Printing Output In Array
        // Method 1
        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }

        // Method 2
        // System.out.println(Arrays.toString(arr));

        // Method 3  By For Each Loop

        // for(int num : arr){
        //     System.out.print(num + " ");
        // }
        for(int num : arr2){
            System.out.print(num + " ");
        }

    }
}
