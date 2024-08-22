import java.util.*;
public class DeletionInMinHeap {
    public static void swap(List<Integer> heap, int l, int r){
        int temp = heap.get(l);
        heap.set(l, heap.get(r));
        heap.set(r, temp);
    }
    
    public static void deleteInMin(List<Integer> heap){
        int n = heap.size();
        swap(heap, 0, n-1);
        heap.remove(n-1);
        pushDown_Min(heap, 0);
    }
    
    public static void pushDown_Min(List<Integer> heap, int index){
        int n = heap.size()-1;
        int left = (2*index) + 1;
        int right = (2*index) + 2;
        int smallest = index;

        if(index==n) return;
        if(left<=n && heap.get(left) < heap.get(index)){
            smallest = left;
        }
        if(right<=n && heap.get(right) < heap.get(index)){
            smallest = right;
        }
        if(smallest==index) return;
        swap(heap, index, smallest);
        pushDown_Min(heap, smallest);
    }
    public static void main(String[] args) {
        List<Integer> heap = new ArrayList<>();
        heap.add(5);
        heap.add(20);
        heap.add(10);
        heap.add(40);
        heap.add(50);
        heap.add(30);
        heap.add(60);
        System.out.print(heap);
        System.out.println();
        deleteInMin(heap);
        System.out.print(heap);
    }
}

