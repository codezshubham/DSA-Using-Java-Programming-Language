public class ArrayImplementation {
    public static class Stack {
        int[] arr = new int[4];
        int idx = 0;

        void push(int x) {
            if (isFull()) {
                System.out.println("Stack Is Full");
                return;
            }
            arr[idx] = x;
            idx++;  
        }

        int peek() {
            if (idx == 0) {
                System.out.println("Stack Is Empty");
                return -1;
            }
            return arr[idx - 1];
        }

        int pop() {
            if (idx == 0) {
                System.out.println("Stack Is Empty");
                return -1;
            }
            int top = arr[idx - 1];
            arr[idx - 1] = 0;
            idx--;
            return top;
        }

        int size() {
            return idx;
        }

        boolean isEmpty() {
            if (idx == 0)
                return true;
            else
                return false;
        }

        boolean isFull() {
            if (idx == arr.length)
                return true;
            else
                return false;
        }

        int capacity() {
            return arr.length;
        }

        void display() {
            if(isEmpty()){
                System.out.println("Stack Is Empty");
            }
            for (int i = 0; i <= idx - 1; i++) {
                System.out.println(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        // st.push(2);
        // st.push(3);
        // st.push(4);
        st.display();
        // System.out.println(st.isFull());
        // st.push(5);
        // st.pop();
        // System.out.println(st.peek());
        // System.out.println(st.capacity());
    }
}
