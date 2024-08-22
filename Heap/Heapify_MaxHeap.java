import java.util.*;
public class Heapify_MaxHeap {
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
            pushDown_Max(arr, 0, i - 1);
        }
    }
    public static void heapify(List<Integer> arr){
        int leaf_parentNode = ((arr.size()-1) - 1) / 2;

        for(int i=leaf_parentNode; i>=0; i--){
            pushDown_Max(arr, i, arr.size()-1);
        }
    }
    public static void pushDown_Max(List<Integer> heap, int index, int n){
        if(index==n) return;
        int left = (2*index) + 1;
        int right = (2*index) + 2;
        int largest = index;

        if(left<=n && heap.get(left) > heap.get(largest)){
            largest = left;
        }
        if(right<=n && heap.get(right) > heap.get(largest)){
            largest = right;
        }
        if(largest==index) return;
        swap(heap, largest, index);
        pushDown_Max(heap, largest, n);
    }
    public static void main(String[] args) {
        List<Integer> heap = new ArrayList<>();
        heap.add(60);
        heap.add(10);
        heap.add(80);
        heap.add(50);
        heap.add(5);
        heap.add(20);
        heap.add(70);
        System.out.print(heap);
        System.out.println();
        heapSort(heap);
        System.out.print(heap);
    }
}

