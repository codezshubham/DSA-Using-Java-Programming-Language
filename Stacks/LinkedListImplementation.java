public class LinkedListImplementation {
    public static class Node{  // User defined data type
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class LLStack{  // User defined Data Structure
        private Node head = null;
        private int size = 0;

        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        int pop(){
            if(head == null){
                System.out.println("Stack is Empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            return x;
        }

        int peek(){
            if(head == null){
                System.out.println("Stack is Empty");
                return -1;
            }
            return head.val;
        }

        int size(){
            return size;
        }

        boolean isEmpty(){
            if(head == null) return true;
            else return false;
        }

        // Simple Display Recursive
        void display(){
            displayRec(head);
            System.out.println();
        }
        void displayRec(Node h){
            if(h == null) return;
            displayRec(h.next);
            System.out.print(h.val + " ");
        }
        // Reverse Display
        void revDisplay(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(4);
        st.display();
        st.push(5);
        st.display();
        st.push(6);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        st.push(7);
        st.push(8);
        st.display();

    }
}
