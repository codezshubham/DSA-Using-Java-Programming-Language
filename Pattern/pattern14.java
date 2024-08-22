public class pattern14 {
    public static void main(String[] args){
        pat14(5);
        pat15(5);
    }

    static void pat14(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n+1-i; j++){
                System.out.print("*");
            }
            for(int s=1; s<=2*i-2; s++){
                System.out.print(" ");
            }
            for(int j=1; j<=n+1-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pat15(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int s=1; s<=2*(n-i); s++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
