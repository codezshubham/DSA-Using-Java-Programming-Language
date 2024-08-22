public class CircularQueueArray {
    public static class CqueueA {
        int[] arr = new int[5];
        int n = arr.length;
        int f = -1; // Front
        int r = -1; // Rear
        int size = 0;

        void add(int val) throws Exception {
            if (size == n) {
                throw new Exception("Queue is full");
            } else if (f == -1) {
                f = r = 0;
                arr[0] = val;
            } else if (r == n - 1) {
                r = 0;
                arr[0] = val;
            } else {
                arr[++r] = val;
            }
            size++;
        }

        int remove() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is Empty");
            }
            if (f == n - 1) {
                f = 0;
            } 
                int x = arr[f];
                f++;
                size--;
                return x;
        }

        int peek() throws Exception{
           if (size == 0) {
                throw new Exception("Queue is Empty");
            }
            return arr[f];
        }

        int size() {
            return size;
        }

        boolean isEmpty() {
            if (size == 0)
                return true;
            else
                return false;
        }

        void display() {
            if (size == 0) {
                System.out.println("Queue Is Empty");
                return;
            }
            else{
                if(f<=r){
                    for (int i = f; i <= r; i++) {
                        System.out.print(arr[i] + " ");
                    }
                }
                else{
                    // f to n-1
                    for (int i = f; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    // 0 to r
                    for (int i = 0; i <= r; i++) {
                        System.out.print(arr[i] + " ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        CqueueA q = new CqueueA();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        q.add(6);
        // q.remove();  //2 3 4 5 
        // q.display();
        System.out.println(q.peek());
        System.out.println(q.size());
    }
}
