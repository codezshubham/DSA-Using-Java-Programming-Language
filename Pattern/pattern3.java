public class pattern3 {
    public static void main(String[] args){
        pat3(5);
    }
    static void pat3(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
