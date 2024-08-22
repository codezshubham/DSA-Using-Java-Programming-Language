public class SumOfDigits {
    static int sum(int n){
        if((n>=0) && n<=9){
            return n;
        }

        // Last digit + recursive digit
        else{
            return (n%10) + sum(n/10);
        }
    }
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(sum(n));
    }
}
