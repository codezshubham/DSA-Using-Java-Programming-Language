import java.util.*;
public class InserationInMaxHeap {
    public static void swap(List<Integer> heap, int l, int r){
        int temp = heap.get(l);
        heap.set(l, heap.get(r));
        heap.set(r, temp);
    }
    public static void pushup_Max(List<Integer> heap, int i){
        int parentIndex = (i-1)/2;
        if(i==0 || heap.get(parentIndex) > heap.get(i)) return;

        swap(heap, i, parentIndex);
        pushup_Max(heap, parentIndex);
    }
    static void insertInMaxHeap(List<Integer> heap, int val){
        heap.add(val);
        int index = heap.size()-1;
        pushup_Max(heap, index);
    }
    public static void main(String[] args) {
        List<Integer> heap = new ArrayList<>();
        heap.add(8);
        heap.add(4);
        heap.add(5);
        heap.add(3);
        heap.add(2);
        heap.add(1);
        System.out.print(heap);
        insertInMaxHeap(heap, 10);
        System.out.println();
        System.out.print(heap);

    }
}

