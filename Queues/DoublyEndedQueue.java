public class DoublyEndedQueue {
    private static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
static class Deque{
    private Node front;
    private Node rear;
    private int size;

    public Deque() {
        front = null;
        rear = null;
        size = 0;
    }

    public void addToFront(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
        size++;
    }

    public void addToRear(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            newNode.prev = rear;
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public int removeFromFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
        }
        int removedData = front.data;
        if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
            front.prev = null;
        }
        size--;
        return removedData;
    }

    public int removeFromRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
        }
        int removedData = rear.data;
        if (front == rear) {
            front = rear = null;
        } else {
            rear = rear.prev;
            rear.next = null;
        }
        size--;
        return removedData;
    }

    public int peekFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
        }
        return front.data;
    }

    public int peekRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
        }
        return rear.data;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
    public static void main(String[] args) {
        Deque dq = new Deque();

        dq.addToFront(1);
        dq.addToFront(2);
        dq.addToRear(3);
        dq.addToRear(4);
    }
}

