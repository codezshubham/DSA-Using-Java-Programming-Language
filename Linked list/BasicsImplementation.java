public class BasicsImplementation{
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
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
        // e.next = null;  By default pointing to null.
       
        display(a);
        System.out.println();
        display(a);
        System.out.println();
        display(b);
        // System.out.println(a.data);
        // System.out.println(a.next.data);
        // System.out.println(a.next.next.data);
        // System.out.println(a.next.next.next.data);
        // System.out.println(a.next.next.next.next.data);

        // Node temp = a;
        // for(int i=1; i<=5; i++){
        //     System.out.print(temp.data + " ");
        //     temp = temp.next;
        // }

        // while(temp!=null){
        //      System.out.print(temp.data + " ");
        //     temp = temp.next;
            
        // }
    }
}