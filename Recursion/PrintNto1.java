// public class PrintNto1 {
//         static void print(int n){
//             if(n==6){
//                 return;
//             }
//             print(n+1);
//             System.out.println(n);
//         }
//         public static void main(String[] args) {
//             print(1);
//         }
//     }

public class PrintNto1 {
        static void print(int n){
            if(n==0){
                return;
            }
            System.out.println(n);
            print(n-1);
        }
        public static void main(String[] args) {
            print(5);
        }
    }