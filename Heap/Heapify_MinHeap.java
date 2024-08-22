import java.util.*;
public class Heapify_MinHeap {
    public static void swap(List<Integer> heap, int l, int r){
        int temp = heap.get(l);
        heap.set(l, heap.get(r));
        heap.set(r, temp);
    }

    public static void heapSort(List<Integer> arr){
        heapify(arr);
        
        int n = arr.size() - 1;
        for(int i = n; i > 0; i--){
            swap(arr, 0, i);
            pushDown_Min(arr, 0, i - 1);
        }
    }
    public static void heapify(List<Integer> arr){
        int leaf_parentNode = ((arr.size()-1) - 1) / 2;

        for(int i=leaf_parentNode; i>=0; i--){
            pushDown_Min(arr, i, arr.size()-1);
        }
    }
    public static void pushDown_Min(List<Integer> heap, int index, int n){
        if(index==n) return;
        int left = (2*index) + 1;
        int right = (2*index) + 2;
        int smallest = index;

        if(left<=n && heap.get(left) < heap.get(smallest)){
            smallest = left;
        }
        if(right<=n && heap.get(right) < heap.get(smallest)){
            smallest = right;
        }
        if(smallest==index) return;
        swap(heap, smallest, index);
        pushDown_Min(heap, smallest, n);
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
        heapSort(heap);
        System.out.print(heap);
    }
}

