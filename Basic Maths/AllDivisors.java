public class AllDivisors {
    public static void printDivisorsOptimal(int n){
		
		System.out.println("The divisors of "+n+" are:");
		for(int i = 1; i <= (int)Math.sqrt(n); i++)
			if(n % i == 0){
				System.out.print(i + " ");
				if(i != n/i) System.out.print(n/i + " ");
			}
			
		System.out.println();
	}
    // static void divisors(int num){
    //     for(int i=1; i<=num; i++){
    //         if((num % i) == 0){
    //             System.out.println(i);
    //         }
    //     }
    // }
    public static void main(String[] args) {
        printDivisorsOptimal(36);
    }
}





