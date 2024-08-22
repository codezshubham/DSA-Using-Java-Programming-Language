import java.util.*;
public class HashMapImplementation {

    static class MyHashMap<K, V> {
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_Load_Factor = 0.75f;

        private class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // The number of entries in map
        private LinkedList<Node>[] buckets;

        private void initBuckets(int N) {
            buckets = new LinkedList[N];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        private int HashFunc(K key) {
            int hc = key.hashCode();
            return (Math.abs(hc) % buckets.length);
        }

        // Traverses the ll and looks for a node with key, if found
        // it returns it's index otherwise it returns null
        private int searchInBucket(LinkedList<Node> ll, K key) {
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key == key) {
                    return i;
                }
            }
            return -1;
        }

        private void rehash() {
            LinkedList<Node>[] oldBuckets = buckets;
            initBuckets(oldBuckets.length * 2);
            n = 0;
            for (var bucket : oldBuckets) {
                for (var node : bucket) {
                    put(node.key, node.value);
                }
            }
        }

        public MyHashMap() {
            initBuckets(DEFAULT_CAPACITY);
        }

        public int capacity() {
            return buckets.length;
        }

        public float load() {
            return (n * 1.0f) / buckets.length;
        }

        public int size() {
            return n;
        }

        public void put(K key, V value) { // Insert/Update
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if (ei == -1) { // key doesn't exist, we have to insert a new node
                Node node = new Node(key, value);
                currBucket.add(node);
                n++;
            } else { // update
                Node currNode = currBucket.get(ei);
                currNode.value = value;
            }

            if (n >= buckets.length * DEFAULT_Load_Factor) {
                rehash();
            }
        }

        public V get(K key) { // Retreive output
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);

            if (ei != -1) { // key exists
                Node currNode = currBucket.get(ei);
                return currNode.value;
            }
            // key doesn't exists
            return null;
        }

        public V remove(K key) {
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);

            if (ei != -1) { // key exists
                Node currNode = currBucket.get(ei);
                V val = currNode.value;
                currBucket.remove(ei);
                n--;
                return val;
            }
            // key doesn't exists
            return null;
        }

    }
    public static void main(String[] args) {
        MyHashMap<String, Integer> mp = new MyHashMap<>();
        System.out.println("testing Put");
        mp.put("a", 1);
        mp.put("b", 2);
        System.out.println("Capacity : " + mp.capacity());
        System.out.println("Load Factor : " + mp.load());
        mp.put("c", 3);
        mp.put("x", 61);
        mp.put("y", 71);
        mp.put("c", 30);

        System.out.println("Testing size " + mp.size());

        // Testing get
        System.out.println(mp.get("x"));
        System.out.println(mp.get("y"));
        // System.out.println(mp.get("c"));
        // System.out.println(mp.get("d"));

        // System.out.println(mp.remove("c"));
        // System.out.println(mp.remove("c"));
        // System.out.println("Testing size " + mp.size());

        System.out.println("Capacity : " + mp.capacity());
        System.out.println("Load Factor : " + mp.load());
    }
}