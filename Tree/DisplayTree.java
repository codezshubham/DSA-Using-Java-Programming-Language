public class DisplayTree{
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    public static void display(Node root){
        if(root==null) return;
        System.out.print(root.val+"->");
        if(root.left!=null) System.out.print(root.left.val+ ",");
        else System.out.print("null, ");
        if(root.right!=null) System.out.print(root.right.val);
        else System.out.print("null, ");
        System.out.println();
        display(root.left);
        display(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(5);
        Node a = new Node(4);
        Node b = new Node(7);
        root.left = a;
        root.right = b;
        Node c = new Node(2);
        Node d = new Node(3);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        Node f = new Node(1);
        b.left = e;
        b.right = f;
        display(root);
    }
}