// import java.util.HashMap;
// import java.util.Scanner;
// class Node 
// {
//     int key, value;
//     Node prev, next;

//     Node(int k, int v) 
//     {
//        key   = k;
//        value = v;
//        prev  = null;
//        next  = null;
//     }
// }
// class LRUCache 
// {
//     int capacity;
//     HashMap<Integer, Node> map;
//     Node head,tail; 
//     LRUCache(int cap)
//     {
//        capacity = cap;
//        map      = new HashMap<>();
//  head = new Node(0, 0);
//        tail = new Node(0, 0);
//        head.next = tail;
//        tail.prev = head;
//     }
//     private void detach(Node node) 
//     {
//        node.prev.next = node.next;
//        node.next.prev = node.prev;
//     }

//     private void insertAtFront(Node node) {
//        node.next      = head.next;
//        node.prev      = head;
//        head.next.prev = node;
//        head.next      = node;
//     }
    
//     private void moveToFront(Node node) {
//        detach(node);
//        insertAtFront(node);
//     }
//     int get(int key) {
//        if (!map.containsKey(key)) return -1;
      
//     Node node = map.get(key);
//        moveToFront(node);          
//        return node.value;
//     }
//     void put(int key, int value) {
//          if (map.containsKey(key)) {
//     Node node = map.get(key);
//             node.value = value;
//             moveToFront(node);

//        } else {
//     if (map.size() == capacity) {
//                 Node lru = tail.prev; 
//     detach(lru);
//                 map.remove(lru.key);
//             }
    
//     Node node = new Node(key, value);
//             insertAtFront(node);
//             map.put(key, node);
//        }
//     }
//        void display() {
//        System.out.print("MRU → LRU : ");
//        Node cur = head.next;
//        while (cur != tail) {
//             System.out.print("[" + cur.key + "=" + cur.value + "] ");
//             cur = cur.next;
//        }
//        System.out.println();
//     }
// }
//     public class main1{
//     public static void main(String[]args){
//        Scanner sc=new Scanner(System.in);
//        int capacity = sc.nextInt();
//        LRUCache cache = new LRUCache(capacity);

//        int n = sc.nextInt();
//        for (int i = 0; i < n; i++) {
//             String op = sc.next();
//             if (op.equals("put")) {
//                 int key = sc.nextInt();
//                 int val = sc.nextInt();
//                 cache.put(key, val);
//             } else if (op.equals("get")) {
//                 int key = sc.nextInt();
//                 System.out.println(cache.get(key));
//             }
//             cache.display();
//        }
//     }
// }
    
    
    
    
    