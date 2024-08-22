public class InsertionDeletionLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class LinkedList{
        Node head;
        Node tail;
        int size = 0;
        void insertAtEnd(int val){
            Node temp = new Node(val);

            if(head == null){
                head = temp;
                tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        void insertAtBegin(int val){
            Node temp = new Node(val);

            if(head == null){
                head = temp;
                tail = temp;
            }
            else{
                temp.next = head;
                head = temp;
            }
            size++;
        }

        void insertAt(int idx, int val){
            Node t = new Node(val);
            Node temp = head;
            if(idx == 0){
                insertAtBegin(val);
                return;
            }
            else if(idx == size){
                insertAtEnd(val);
                return;
            }
            else if(idx > 0 || idx < 0){
                System.out.println("Wrong Index");
                return;
            }
            else{
            for(int i=1; i<=idx-1; i++){
                temp = temp.next;
            }

            t.next = temp.next;
            temp.next = t;
        }
        size++;
        }

        void deleteAtBegin(){
            if(head == null){
                return;
            }
            head = head.next;
            size--;
        }

        void deleteAtEnd(){
            Node temp = head;
            if(head == null){
                return;
            }
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
            size--;
        }
        
        void deleteAt(int idx){
            Node temp = head;

            for(int i=1; i<=idx-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }

        int getAt(int idx){
            Node temp = head;

            for(int i=1; i<=idx; i++){
                temp = temp.next;
            }
            return temp.data;
        }
        
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        // Not used due to 0(n) time complexity
        // int size(){
        //     Node temp = head;
        //     int count = 0;
        //     while(temp!=null){
        //         count++;
        //         temp = temp.next;
        //     }
        //     return count;
        // }
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(7);
        ll.display();
        ll.insertAtEnd(6);
        ll.display();
        ll.insertAtBegin(5);
        ll.display();
        ll.insertAtBegin(4);
        ll.display();
        ll.insertAt(4, 3);
        ll.display();
        ll.insertAt(0, 3);
        ll.display();
        ll.deleteAt(4);
        ll.display();
        ll.deleteAtBegin();
        ll.display();
        ll.deleteAtEnd();
        ll.display();
        // System.out.println(ll.getAt(3));
        System.out.println(ll.size);
        // System.out.println(ll.tail.data);
        // System.out.println(ll.length());
    }
}
