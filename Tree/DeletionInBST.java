import java.util.*;
public class DeletionInBST {
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
        if(root==null) return;
        if (n == 1) {
            System.out.print(root.val + " ");
            return;
        }
        nthLevel(root.left, n - 1);
        nthLevel(root.right, n - 1);
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

    public static void delete(Node root, int val){      // Delete a leaf node
        if(root==null) return;
        
        // Left SubTree
        if(root.val>val){
            if(root.left==null) return;
            if(root.left.val==val){
                Node l = root.left;
                if(l.left==null && l.right==null) root.left = null;  // 0 child
                else if(l.left==null || l.right==null){   // 1 child
                    if(l.left!=null) root.left = l.left;
                    else root.left = l.right; 
                }
                else{    // 2 child
                    Node curr = l;
                    Node pred = curr.left;
                    while(pred.right!=null) pred = pred.right;
                    delete(root, pred.val);
                    pred.left = curr.left;
                    pred.right = curr.right;
                    root.left = pred;
                }
            } 
            else delete(root.left, val);
        }

        // Right SubTree
        else{
            if(root.right==null) return;
            if(root.right.val==val){
                Node r = root.right;
                if(r.left==null && r.right==null) root.right = null;  // 0 child
                if(r.left==null || r.right==null){   // 1 child
                    if(r.right!=null) root.right = r.right;
                    else root.right = r.left; 
                }
                else{    // 2 child
                    Node curr = r;
                    Node pred = curr.left;
                    while(pred.right!=null) pred = pred.right;
                    delete(root, pred.val);
                    pred.left = curr.left;
                    pred.right = curr.right;
                    root.right = pred;
                }
            } 
            else delete(root.right, val);
        }
    }
    public static void main(String[] args) {
        String[] arr = {"50","20","60","17","34","55","89","10","","28","","","","70","","","14"};
        Node root = constructBFS(arr);
        // print level order traversal
        int level = height(root) + 1;
        for(int i=1; i<=level; i++){
            nthLevel(root, i);
            System.out.println();
        }
        delete(root, 20);
         int level1 = height(root) + 1;
        for(int i=1; i<=level1; i++){
            nthLevel(root, i);
            System.out.println();
        }
    }
}
