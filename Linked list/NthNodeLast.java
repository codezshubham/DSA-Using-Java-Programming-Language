public class NthNodeLast {
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static Node nthNode(Node head, int node) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        int m = size - node + 1;
        temp = head;
        for (int i = 1; i <= m - 1; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // In One Traversal --->
    public static Node nthNode2(Node head, int node) {
        Node slow = head;
        Node fast = head;

        for (int i = 1; i <= node; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(1);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(7);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        // display(a);
        Node x = nthNode2(a, 2);
        System.out.println(x.data);
    }
}
