import java.util.ArrayList;
import java.util.List;
public class LeftSideView {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
     public static int height(Node root){
        if(root==null || (root.left==null && root.right==null)) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
    public static void postOrder(Node root, List<Integer> ans, int level){
        if(root==null) return;
        ans.set(level-1, root.val);
        if(root.right!=null) postOrder(root.right, ans, level+1);
        if(root.left!=null) postOrder(root.left, ans, level+1);
    }
    public static List<Integer> leftSideView(Node root) {
        List<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        int level = height(root) + 1;
        for(int i=0; i<level; i++){
            ans.add(0);
        }
        postOrder(root, ans, 1);
        return ans;
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
        List<Integer> sol = leftSideView(root);
        System.out.print(sol);
    }
}
