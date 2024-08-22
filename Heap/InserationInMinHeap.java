import java.util.*;
public class InserationInMinHeap{
    public static void swap(List<Integer> heap, int l, int r){
        int temp = heap.get(l);
        heap.set(l, heap.get(r));
        heap.set(r, temp);
    }
    public static void pushup_Min(List<Integer> heap, int i){
        int parentIndex = (i-1)/2;
        if(i==0 || heap.get(parentIndex) < heap.get(i)) return;

        swap(heap, i, parentIndex);
        pushup_Min(heap, parentIndex);
    }
    static void insertInMinHeap(List<Integer> heap, int val){
        heap.add(val);
        int index = heap.size()-1;
        pushup_Min(heap, index);
    }
    public static void main(String[] args) {
        List<Integer> heap = new ArrayList<>();
        heap.add(10);
        heap.add(20);
        heap.add(30);
        heap.add(40);
        heap.add(50);
        heap.add(60);
        System.out.print(heap);
        insertInMinHeap(heap, 5);
        System.out.println();
        System.out.print(heap);

    }
}