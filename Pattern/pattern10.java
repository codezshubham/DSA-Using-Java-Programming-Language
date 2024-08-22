public class pattern10 {
    public static void main(String[] args){
        pat10(5);
        pat11(5);
    }

        static void pat10(int n){
            for(int i=1; i<=n; i++){
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        static void pat11(int n){
                for(int i=1; i<=n; i++){
                    for(int j=1; j<=(n-i); j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }

    }

