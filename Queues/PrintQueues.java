import java.util.*;
public class PrintQueues {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q1 = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        
        while(q.size() > 0){
            q1.add(q.remove());
        }
        while(q1.size() > 0){
            int top = q1.remove();
            System.out.print(top + " ");
            q.add(top);
        }
}
}
