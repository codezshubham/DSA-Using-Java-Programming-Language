public class SumNatural{
    static int print(int n){
        if(n==1){
            return 1;
        }
        else{
            return n + print(n-1);
        }
    }
    public static void main(String[] args) {
       int ans = print(5);
       System.out.println("The sum of first n Numbers is : " + ans);
    }
}