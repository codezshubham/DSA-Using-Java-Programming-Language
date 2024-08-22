import java.util.*;
public class ImplementGenerics {
    public static void formTree(Node root){
        root.child.add(new Node(5));
        root.child.add(new Node(11));
        root.child.add(new Node(63));
        root.child.get(0).child.add(new Node(1));
        root.child.get(0).child.add(new Node(4));
        root.child.get(0).child.add(new Node(8));
        root.child.get(1).child.add(new Node(6));
        root.child.get(1).child.add(new Node(7));
        root.child.get(1).child.add(new Node(15));
        root.child.get(2).child.add(new Node(31));
        root.child.get(2).child.add(new Node(55));
        root.child.get(2).child.add(new Node(65));
    }
    public static class Node{
        int val;
        List<Node> child;
        Node(int val){
            this.val = val;
            child = new ArrayList<>();
        }
    }
    public static void preOrder(Node root){
        if(root.child.isEmpty()){
            System.out.print(root.val+ " ");
            return;
        }
        System.out.print(root.val+ " ");
        int n = root.child.size();
        for(int i=0; i<n; i++){
            preOrder(root.child.get(i));
        }
    }
    public static void postOrder(Node root){
        if(root.child.isEmpty()){
            System.out.print(root.val+ " ");
            return;
        }
        int n = root.child.size();
        for(int i=0; i<n; i++){
            postOrder(root.child.get(i));
        }
        System.out.print(root.val+ " ");
    }
    public static void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            Node currNode = q.remove();
            System.out.print(currNode.val+" ");
            int noOfChilds = currNode.child.size();
            for(int i=0; i<noOfChilds; i++){
                q.add(currNode.child.get(i));
            }
        }
    }
    public static void main(String[] args) {
        Node root = new Node(30);
        formTree(root);
        preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        levelOrder(root);
    }
}
