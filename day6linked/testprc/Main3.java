
// //reorder the linkedlist


// import java.util.Scanner;

// class Node {
//     int data;
//     Node next;

//     Node(int data) {
//        this.data = data;
//        this.next = null;
//     }
// }

// class LinkedList {

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

    
//     void reorder() {

//        if (head == null || head.next == null)
//             return;

    
//        Node slow = head;
//        Node fast = head;

//        while (fast.next != null && fast.next.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//        }

      
//        Node prev = null;
//        Node curr = slow.next;
//        slow.next = null;

//        while (curr != null) {
//             Node nextNode = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = nextNode;
//        }

       
//        Node first = head;
//        Node second = prev;

//        while (second != null) {
//             Node temp1 = first.next;
//             Node temp2 = second.next;

//             first.next = second;
//             second.next = temp1;

//             first = temp1;
//             second = temp2;
//        }
//     }
//     void display() {
//        Node temp = head;
//        while (temp != null) {
//             System.out.print(temp.data);
//             if (temp.next != null)
//                 System.out.print(" ->");
//             temp = temp.next;
//        }
//        System.out.println();
//     }
// }

// public class Main3 {
//     public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        LinkedList list = new LinkedList();

//        int n = sc.nextInt();

//        for (int i = 0; i < n; i++) {
//             list.insert(sc.nextInt());
//        }

       
//        list.display();

//        list.reorder();

      
//        list.display();

//        sc.close();
//     }
// }