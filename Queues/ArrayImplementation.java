public class ArrayImplementation {
    public static class queueA{
        int[] arr = new int[5];
        int f = -1;  // Front
        int r = -1;  // Rear
        int size = 0;

        void add(int val){
            if(r == arr.length-1){
                System.out.println("Stack is full");
                return;
            }
            if(f==-1){
                f = r = 0;
                arr[0] = val;
            }
            else{
                arr[++r] = val;
            }
            size++;
        }

        int remove(){
            if(size == 0){
                System.out.println("Stack Is Empty");
                return -1;
            }
            int x = arr[f];
            f++;
            size--;
            return x;
        }

        int peek(){
            if(size == 0){
                System.out.println("Stack Is Empty");
                return -1;
            }
            return arr[f];
        }

        int size(){
            return size;
        }

        boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
        void display(){
            if(size == 0){
                System.out.println("Stack Is Empty");
                return;
            }
            for(int i=f; i<=r; i++){
                System.out.println(arr[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        queueA q = new queueA();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.size());
    }
}
