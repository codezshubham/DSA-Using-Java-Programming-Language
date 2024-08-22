import java.util.*;
public class ZigzagGenerics {
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
    public static void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        boolean flag = false;
        q.add(root);
        while(q.size()>0){
            int levelSize = q.size();
            List<Node> currentLevel = new ArrayList<>();
            while(levelSize-- > 0){
            Node currNode = q.remove();
            currentLevel.add(currNode);
            int noOfChilds = currNode.child.size();
            for(int i=0; i<noOfChilds; i++){
                q.add(currNode.child.get(i));
            }
        }
        if(flag == false){
            printList(currentLevel);
        }
        else{
            // reverse(currentLevel);
            printList(currentLevel);
        }
        flag = !flag;
    }
}
    public static void printList(List<Node> nodeSize){
        for(int i=0; i<nodeSize.size(); i++){
            System.out.print(nodeSize.get(i).val+ " ");
        }
    }
    public static void main(String[] args) {
        Node root = new Node(30);
        formTree(root);
    }
}
