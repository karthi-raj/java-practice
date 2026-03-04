// import java.util.Scanner;

// class Node {
//     int data;
//     Node prev, next;

//     Node(int data) {
//        this.data = data;
//        prev = next = null;
//     }
// }

// class DoublyLinkedList {
//     Node head = null;

   
//     void insertFront(int data) {
//        Node newNode = new Node(data);

//        if (head != null) {
//             head.prev = newNode;
//             newNode.next = head;
//        }

//        head = newNode;
//     }

 
//     void removeDuplicates() {
//        Node current = head;
//        while (current != null) {
//             Node temp = current.next;
//             while (temp != null) {
//                 if (current.data == temp.data) {
//                    if (temp.next != null) {
//                         temp.next.prev = temp.prev;
//                    }
//                    temp.prev.next = temp.next;
//                 }
//                 temp = temp.next;
//             }
//             current = current.next;
//        }
//     }

  
//     void display() {
//        Node temp = head;
//        while (temp != null) {
//             System.out.print(temp.data);
//             if (temp.next != null)
//                 System.out.print(" ");
//             temp = temp.next;
//        }
//     }
// }

// public class Main1{
//     public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

//        int n = sc.nextInt();
//        DoublyLinkedList list = new DoublyLinkedList();

//        for (int i = 0; i < n; i++) {
//             list.insertFront(sc.nextInt());
//        }

//        list.removeDuplicates();
//        list.display();
//     }
// }