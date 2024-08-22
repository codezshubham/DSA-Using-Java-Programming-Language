public class TraversalTreeDFS {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }

    public static void preOrder(Node root){
        if(root==null) return;
        System.out.print(root.val+ " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root){
        if(root==null) return;
        inOrder(root.right);
        System.out.print(root.val+ " ");
        inOrder(root.left);
    }

    public static void postOrder(Node root){
        if(root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+ " ");
    }
    
    public static void main(String[] args) {
        Node root = new Node(5);
        Node a = new Node(3);
        Node b = new Node(7);
        root.left = a;
        root.right = b;
        Node c = new Node(2);
        Node d = new Node(4);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        Node f = new Node(8);
        b.left = e;
        b.right = f;
        // preOrder(root);
        // System.out.println();
        inOrder(root);
        // System.out.println();
        // postOrder(root);
    }
}
