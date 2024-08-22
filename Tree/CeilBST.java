

public class CeilBST {
    public static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }
    public static int ceilBST(Node root, int key){
        int ceil = -1;
        
        while(root!=null){
            if(root.val==key){
                return root.val;
            }
            else if(root.val<key){
                root = root.right;
            }
            else{
                ceil = root.val;
                root = root.left;
            }
        }
        return ceil;
    }
    public static int floorBST(Node root, int key){
        int floor = -1;
        
        while(root!=null){
            if(root.val==key){
                return root.val;
            }
            else if(root.val>key){
                root = root.left;
            }
            else{
                floor = root.val;
                root = root.right;
            }
        }
        return floor;
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
        Node f = new Node(9);
        b.left = e;
        b.right = f;
        int ans1 = ceilBST(root, 8);
        System.out.println(ans1);
        int ans2 = floorBST(root, 8);
        System.out.println(ans2);
    }
}
