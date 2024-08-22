public class AlternateSum {
    static int alternate(int n){
        if(n==0){
            return 0;
        }
        else{
            if((n%2) == 0){
                return alternate(n-1) - n;            
            }
            return alternate(n-1) + n;
        }

    }
    public static void main(String[] args) {
        System.out.println(alternate(5));
    }
}
