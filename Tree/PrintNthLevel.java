public class PrintNthLevel {
    public static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }
    
    public static int height(Node root){
        if(root==null || (root.left==null && root.right==null)) return 0;
        return 1 + Math.max(height(root.left) , height(root.right));
    }
    public static void nthLevel(Node root, int n) {
        if (n == 1) {
            System.out.print(root.val + " ");
            return;
        }
        if(root.left!=null) nthLevel(root.left, n - 1);
        if(root.right!=null) nthLevel(root.right, n - 1);
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
        int level = height(root) + 1;
        for(int i=1; i<=level; i++){
            nthLevel(root, i);
            System.out.println();
        }
    }
}
