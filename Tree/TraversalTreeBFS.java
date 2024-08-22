import java.util.*;
public class TraversalTreeBFS {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }

    public static void bfs(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root!=null) q.add(root);
        while(q.size()>0){
            Node temp = q.peek();
            if(temp.left!=null) q.add(temp.left);
            if(temp.right!=null) q.add(temp.right);
            System.out.print(temp.val + " ");
            q.remove();
        }
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
        bfs(root);
    }
}
