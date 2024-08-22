public class InsertionDeletionDLL {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node insertAtBegin(Node head, int val){
        Node temp = new Node(val);
        temp.next = head;
        head.prev = temp;
        head = temp;
        return head;
    }
    public static Node insertAtEnd(Node head, int val){
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        Node tempe = new Node(val);
        temp.next = tempe;
        tempe.prev = temp;
        temp = tempe;
        return head;
    }

    public static Node insertAtIndex(Node head, int idx, int val){
        Node temp = head;
        for(int i=1; i<=idx-1; i++){
            temp = temp.next;
        }
        Node t = new Node(val);
        t.prev = temp;
        t.next = temp.next;

        if (temp.next != null) {
            temp.next.prev = t;
        }

        temp.next = t;
        return head;
    }

    public static Node deleteAtBegin(Node head){
        head = head.next;
        head.prev = null;
        return head;
    }

    public static Node deleteAtEnd(Node head){
        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public static Node deleteAtIndex(Node head, int idx){
        Node temp = head;
        for(int i=1; i<=idx-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if (temp.next != null) {
            temp.next.prev = temp;
        }
        return head;
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(1);
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        display(a);
        // Node x = insertAtBegin(a, 7);
        // display(x);
        // Node y = insertAtEnd(a, 6);
        // display(y);
        // Node z = insertAtIndex(a, 5, 0);
        // display(z);
        // Node w = deleteAtBegin(a);
        // display(w);
        // Node w = deleteAtEnd(a);
        // display(w);
        Node w = deleteAtIndex(a, 2);
        display(w);

    }
}