public class TwoSumDLL {
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

    public static void twoSum(Node head, int target){
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }

        Node h = head;
        Node t = temp;

        while(h.data < t.data){
            if((h.data + t.data) == target){
                System.out.print(h.data + " " + t.data);
                break;
            }
            else if((h.data + t.data) > target){
                t = t.prev;
            }
            else{
                h = h.next;
            }
        }
    }
    
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
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
        twoSum(a, 3);
    }
}


