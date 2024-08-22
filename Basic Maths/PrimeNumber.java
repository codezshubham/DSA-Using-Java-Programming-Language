public class PrimeNumber {
    static void prime(int n) {
        int count = 0;
        // for(int i=1; i<=n; i++){
        // if((n % i) == 0){
        // count++;
        // }
        // }

        // if(count == 2){
        // System.out.println("yes");
        // }
        // else{
        // System.out.println("no");
        // }
        //

        // Square root method -->
        for (int i = 1; i*i <= n; i++){
            if (n % i == 0) {
                count++;
                if (i != n / i)
                    count++;
            }
        }

    if(count==2)

    {
        System.out.println("yes");
    }else
    {
        System.out.println("no");
    }

}

    public static void main(String[] args) {
        prime(29);
    }
}
