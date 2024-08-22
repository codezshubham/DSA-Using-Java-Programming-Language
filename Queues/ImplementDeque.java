import java.util.*;

public class ImplementDeque {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addFirst(3);
        dq.addFirst(4);
        dq.addLast(5);
        dq.removeFirst();
        dq.removeLast();
        System.out.println(dq);
    }
}
