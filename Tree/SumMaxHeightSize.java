public class SumMaxHeightSize {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    public static int size(Node root){
        if(root==null) return 0;
        return 1 + size(root.left) + size(root.right);
    }
    public static int sum(Node root){
        if(root==null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }
    public static int max(Node root){
        if(root==null) return Integer.MIN_VALUE;
        // int a = root.val;
        // int b = max(root.left);
        // int c = max(root.right);
        // return Math.max(a, Math.max(b, c));
        return Math.max(root.val, Math.max(max(root.left), max(root.right)));
    }
    public static int height(Node root){
        if(root==null || (root.left==null && root.right==null)) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
    public static void main(String[] args) {
        Node root = new Node(5);
        Node a = new Node(4);
        Node b = new Node(2);
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
        System.out.println(size(root));
        System.out.println(sum(root));
        System.out.println(max(root));
        System.out.println(height(root));
    }
}
