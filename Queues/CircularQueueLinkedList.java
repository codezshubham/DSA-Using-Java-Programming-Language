public class CircularQueueLinkedList {
        public static class Node{
            int val;
            Node next;
            Node(int val){
                this.val = val;
            }
        }
    
        public static class queueLL{
            Node head = null;
            Node tail = null;
            int size = 0;
    
            void add(int val){
                Node temp = new Node(val);
                if(size==0){
                    head = tail = temp;
                }
                else{
                    tail.next = temp;
                    tail = temp;
                    tail.next = head;
                }
                size++;
            }
    
            int remove(){
                if(size==0){
                    System.out.println("Queue is Empty");
                    return -1;
                }
                int x = head.val;
                head = head.next;
                tail.next = head;
                size--;
                return x;
            }
    
            int peek(){
                if(size==0){
                    System.out.println("Queue is Empty");
                    return -1;
                }
                return head.val;
            }
    
            int size(){
                return size;
            }
    
            boolean isEmpty(){
                if(size==0) return true;
                else return false;
            }
    
            void display(){
                if(size==0){
                    System.out.println("Queue is Empty");
                    return;
                }
                System.out.print(head.val+" ");
                Node temp = head.next;
                while(temp!=head){
                    System.out.print(temp.val + " ");
                    temp = temp.next;
                }
                System.out.println();
            }
        }
        public static void main(String[] args) {
            queueLL q = new queueLL();
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
    
            q.display();
            // q.remove();
            // q.display();
            // System.out.println(q.peek());
        }
    }
    

