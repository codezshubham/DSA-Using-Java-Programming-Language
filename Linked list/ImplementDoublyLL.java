public class ImplementDoublyLL {
    public static class Node{
        int data;
        Node next;
        Node prev;
       public Node(int data){
           this.data = data;
       }
   }

   public static void display(Node head){
    Node temp = head;
    while(temp != null){
        System.out.print(temp.data + " ");
        temp = temp.next;
    }
    System.out.println();
}

   public static void displayrev(Node tail){
    Node temp = tail;
    while(temp != null){
        System.out.print(temp.data + " ");
        temp = temp.prev;
    }
}

    public static void displayAt(Node random){
        Node temp = random;
        while(temp.prev!=null){
            temp = temp.prev;
        }
        while(temp != null){
        System.out.print(temp.data + " --> ");
        temp = temp.next;
    }
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
    //    display(a);
    //    displayrev(e);
        displayAt(a);
   }
}
