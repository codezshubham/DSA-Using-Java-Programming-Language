public class pattern11 {
    public static void main(String[] args){
        pat11(5);
    }
    
    static void pat11(int n){
        int start = 0;
        for(int i=1; i<=n; i++){

            if(i%2==0) start = 0;
            else start = 1;

            for(int j=1; j<=i; j++){
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }
}
