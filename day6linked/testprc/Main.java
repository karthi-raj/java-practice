
// //  K Node

// import java.util.Scanner;

// class Node {
//     int data;
//     Node next;

//     Node(int data) {
//        this.data = data;
//        this.next = null;
//     }
// }

// class SinglyLinkedList {

//     Node head;

//     void insert(int data) {
//        Node newNode = new Node(data);

//        if (head == null) {
//             head = newNode;
//             return;
//        }

//        Node temp = head;
//        while (temp.next != null) {
//             temp = temp.next;
//        }

//        temp.next = newNode;
//     }

//     void removelast(int k) {

//        if (head == null)
//             return;

        
//        Node temp = head;
//        int count = 0;

//        while (temp != null) {
//             count++;
//             temp = temp.next;
//        }

//        if (k > count)
//             return;

       
//        if (k == count) {
//             head = head.next;
//             return;
//        }

//        int s = count - k;
//        temp = head;

//        for (int i = 1; i < s; i++) {
//             temp = temp.next;
//        }

//        temp.next = temp.next.next;
//     }

//     void display() {
//        Node temp = head;
//        while (temp != null) {
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//        }
//        System.out.println();
//     }
// }

// public class Main {
//     public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        SinglyLinkedList list = new SinglyLinkedList();

//        int n = sc.nextInt();

//        for (int i = 0; i < n; i++) {
//             list.insert(sc.nextInt());
//        }

//        int k = sc.nextInt();

//        list.removelast(k);

//        list.display();

//        sc.close();
//     }
// }
