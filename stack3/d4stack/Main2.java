import java.util.HashMap;
import java.util.Scanner;

class Node {
    int key, value;
    Node prev, next;

    Node(int k, int v) {
        key   = k;
        value = v;
        prev  = null;
        next  = null;
    }
}

class Deque {
    Node head, tail;
    int size;

    Deque() {
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
        size = 0;
    }

    void detach(Node node) {
        node.prev.next = node.next;       // Fix #1: was node.nextt
        node.next.prev = node.prev;       // Fix #2: was node.next.prv
        size--;
    }

    void enqueueRear(Node node) {         // Fix #3: was enqueueRjear
        node.prev      = tail.prev;       // Fix #4: was tail.prv
        node.next      = tail;
        tail.prev.next = node;
        tail.prev      = node;
        size++;
    }

    Node dequeueFront() {
        if (isEmpty()) return null;
        Node lru = head.next;
        detach(lru);
        return lru;
    }

    void moveToRear(Node node) {
        detach(node);
        enqueueRear(node);
    }

    boolean isEmpty() {
        return head.next == tail;
    }

    void display() {
        System.out.print("LRU -> MRU : ");
        Node cur = head.next;            
        while (cur != tail) {
            System.out.print("[" + cur.key + "=" + cur.value + "] ");
            cur = cur.next;
        }
        System.out.println();
    }
}                                         

class LRUCache {
    int capacity;
    HashMap<Integer, Node> map;
    Deque queue;

    LRUCache(int cap) {
        capacity = cap;
        map      = new HashMap<>();
        queue    = new Deque();
    }

    int get(int key) {
        if (!map.containsKey(key)) return -1;
        Node node = map.get(key);
        queue.moveToRear(node);
        return node.value;
    }

    void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            queue.moveToRear(node);
        } else {
            if (map.size() == capacity) {      
                Node lru = queue.dequeueFront(); 
                if (lru != null) map.remove(lru.key);
            }
            Node node = new Node(key, value);  
            queue.enqueueRear(node);
            map.put(key, node);
        }
    }

    void display() {
        queue.display();
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int capacity = sc.nextInt();
        LRUCache cache = new LRUCache(capacity);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String op = sc.next();
            if (op.equals("put")) {
                int key = sc.nextInt();
                int val = sc.nextInt();
                cache.put(key, val);
            } else if (op.equals("get")) {
                int key = sc.nextInt();
                System.out.println(cache.get(key));
            }
            cache.display();
        }
    }
}