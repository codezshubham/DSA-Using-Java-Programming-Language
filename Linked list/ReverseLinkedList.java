public class ReverseLinkedList {
    public static void display(Node head){
        if(head == null) {
            System.out.println();
            return;
        }
        System.out.print(head.data + " ");
        display(head.next);
        
    }
    public static Node reverse(Node head){
        if(head.next == null) return head;
        Node newHead = reverse(head.next);
        head.next.next = head;  // Interchanging
        head.next = null;
        return newHead;
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
        a = reverse(a);
        display(a);
}
}
