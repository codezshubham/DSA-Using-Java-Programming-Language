public class pattern8 {
    public static void main(String[] args){
        pat6(5);
        pat7(5);
    }
    static void pat6(int n){
        for(int i=1; i<=n; i++){
            for(int s=1; s<=(n-i); s++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            for(int s=1; s<=(n-i); s++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pat7(int n){
        for(int i=1; i<=n; i++){
            for(int s=1; s<=(i-1); s++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*(n-i)+1; j++){
                System.out.print("*");
            }
            for(int s=1; s<=(i-1); s++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
