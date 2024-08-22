public class PrintNatural {
    static void printIncreasing(int n){

        // Base Condition
        if(n==1){
            System.out.println(1);
            return;
        }

        // Recursive Work
        printIncreasing(n-1);

         // Self work
        System.out.println(n);

    }

    static void printDecreasing(int n){

        // Base Condition
        if(n==1){
            System.out.println(1);
            return;
        }

        // Self work
        System.out.println(n);

        // Recursive Work
        printDecreasing(n-1);

    }

    public static void main(String[] args) {
        printIncreasing(5);
        printDecreasing(5);
    }
}
