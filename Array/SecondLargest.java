public class SecondLargest{
    public static void main(String[] args) {
        int[] arr = {7, 7, 7, 7, 7, 7};
        int largest = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println("The Largest Element :" + largest);

        int Slargest = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > Slargest && arr[i] < largest){
                Slargest = arr[i];
            }
        }
        System.out.println("Second Largest Element:" + Slargest);
    }
}