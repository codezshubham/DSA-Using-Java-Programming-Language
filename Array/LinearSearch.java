import java.util.Scanner;
public class LinearSearch {
    static int linear(int[] arr, int a){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == a){
               return i;
            }
            }
            return -1;
            
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Element You Wanna Search For In Array:");
        int a = sc.nextInt();
        int[] arr = {6, 7, 8, 4, 1};

        
        System.out.println(linear(arr, a));
        }
}
