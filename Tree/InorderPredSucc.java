import java.util.*;
public class InorderPredSucc {
    static int pred = -1;
    static int succ = -1;
    static Node temp = null;
    static boolean flag = false;
    public static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    public static void inOrder(Node root, int val){
        if(root==null) return;
        inOrder(root.left, val);
        if(temp==null){
            temp = root;
        }
        else{
            if(root.val==val){
                pred = temp.val;
                flag = true;
            }
            else if(root.val>val && flag == true){
                succ = root.val;
                flag = false;
            }
            else{
                temp = root;
            }
        }
        inOrder(root.right, val);
    }

    public static Node constructBFS(String[] arr){
        int n = arr.length;
        int x = Integer.parseInt(arr[0]);
        Node root = new Node(x);
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        int i = 1;
        while(i<n-1){
            Node temp = q.remove();
            Node left = new Node(0);
            Node right = new Node(0);

            if(arr[i].equals("")) left = null;
            else{
                int l = Integer.parseInt(arr[i]);
                left.val = l;
                q.add(left);
            }

            if(arr[i+1].equals("")) right = null;
            else{
                int r = Integer.parseInt(arr[i+1]);
                right.val = r;
                q.add(right);
            }

            temp.left = left;
            temp.right = right;
            i+=2;
        }
        return root;
    }
    public static void main(String[] args) {
        String[] arr = {"50","30","70","20","40","60","80"};
        Node root = constructBFS(arr);
        // inorder traversal
        int val = 70;
        inOrder(root, val);
        System.out.println(pred);
        System.out.println(succ);
    }
}
