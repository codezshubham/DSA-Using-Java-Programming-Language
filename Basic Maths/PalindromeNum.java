public class PalindromeNum {
        static void palindromeno(int num){
            int palin = num;
            int reverse = 0;
            int lastdigit = 0;
    
            while(num>0){
                lastdigit = num % 10;
                reverse = (reverse * 10) + lastdigit; 
                num = num / 10;
            }
    
            if(palin == reverse){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
        public static void main(String[] args) {
            palindromeno(121);
        }
    }
    
