public class ArmstrongNo {
        static void armstrongno(int num){
            int dup = num;
            int sum = 0;
            int ld = 0;
    
            while(num>0){
                ld = num % 10;
                sum = sum + (ld * ld * ld);
                num = num / 10;
            }
    
            if(dup == sum){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
        public static void main(String[] args) {
            armstrongno(153);
        }
    }
