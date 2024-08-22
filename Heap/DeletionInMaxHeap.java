import java.util.*;
public class DeletionInMaxHeap {
    public static void swap(List<Integer> heap, int l, int r){
        int temp = heap.get(l);
        heap.set(l, heap.get(r));
        heap.set(r, temp);
    }
    
    public static void deleteInMax(List<Integer> heap){
        int n = heap.size();
        swap(heap, 0, n-1);
        heap.remove(n-1);
        pushDown_Max(heap, 0);
    }

    public static void pushDown_Max(List<Integer> heap, int index){
        int n = heap.size()-1;
        int left = (2*index) + 1;
        int right = (2*index) + 2;
        int largest = index;

        if(index==n) return;
        if(left<=n && heap.get(left) > heap.get(index)){
            largest = left;
        }
        if(right<=n && heap.get(right) > heap.get(index)){
            largest = right;
        }
        if(largest==index) return;
        swap(heap, index, largest);
        pushDown_Max(heap, largest);
    }
    public static void main(String[] args) {
        List<Integer> heap = new ArrayList<>();
        heap.add(90);
        heap.add(80);
        heap.add(70);
        heap.add(20);
        heap.add(10);
        heap.add(50);
        heap.add(60);
        System.out.print(heap);
        System.out.println();
        deleteInMax(heap);
        System.out.print(heap);
    }
}



