// import java.util.*;

// class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

// class LinkedList {

//     Node head;

//     void insert(int data) {
//         Node newNode = new Node(data);

//         if (head == null) {
//             head = newNode;
//             return;
//         }

//         Node temp = head;
//         while (temp.next != null) {
//             temp = temp.next;
//         }
//         temp.next = newNode;
//     }


//     void myList() {
//     Node even = null, odd = null, temp = head;

//     while (temp != null) {
//         Node n = new Node(temp.data);
//         if (temp.data % 2 == 0) {
//             n.next = even;
//             even = n;
//         } else {
//             n.next = odd;
//             odd = n;
//         }
//         temp = temp.next;
//     }

//     if (even == null) head = odd;
//     else {
//         Node t = even;
//         while (t.next != null) t = t.next;
//         t.next = odd;
//         head = even;
//     }
// }

//     void display() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//     }
// }


// // void reorder() {
// //         if (head == null || head.addr == null) return;

// //         Node odd  = head;          // 1st node (odd)
// //         Node even = head.addr;     // 2nd node (even)
// //         Node evenHead = even;      // save even head to connect later

// //         while (even != null && even.addr != null) {
// //             odd.addr  = even.addr; // odd points to next odd
// //             odd       = odd.addr;  // move odd forward
// //             even.addr = odd.addr;  // even points to next even
// //             even      = even.addr; // move even forward
// //         }

// //         odd.addr = evenHead;       // connect odd tail to even head
// //     }
// public class Main {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();

//         LinkedList list = new LinkedList();

//         for (int i = 0; i < n; i++) {
//             list.insert(sc.nextInt());
//         }

//         list.myList();
//         list.display();
//     }
// }