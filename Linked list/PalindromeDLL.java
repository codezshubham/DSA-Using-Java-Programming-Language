public class PalindromeDLL {
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

    public static boolean isPalin(Node head){
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }

        Node h = head;
        Node t = temp;

        while(h!=t){
            if(h.data!=t.data) return false;
            h = h.next;
            t = t.prev;
        }
        return true;
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        System.out.println(isPalin(a));
    }
}
