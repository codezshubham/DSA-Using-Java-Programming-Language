        public class LengthOfLLIterative {
        public static void display(Node head){
            int count = 0;
            while(head != null){
                count++;
                head = head.next;
            }
            System.out.println("No. of elements present in Linked List are : " + count);
        }
        
        public static class Node{
             int data;
             Node next;
            public Node(int data){
                this.data = data;
            }
        }
        public static void main(String[] args) {
            Node a = new Node(5);
            Node b = new Node(4);
            Node c = new Node(3);
            Node d = new Node(2);
            Node e = new Node(1);
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            display(a);
}
}