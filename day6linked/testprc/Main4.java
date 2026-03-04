//hardlevel//reverse Linkedlist in K group

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {

    Node head;

    void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    Node reverseK(Node head, int k) {

        if (head == null)
            return null;

        Node curr = head;
        Node prev = null;
        Node next = null;

        int count = 0;

        
        while (curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        
        if (next != null) {
            head.next = reverseK(next, k);
        }

        return prev;
    }

    void reverseInGroups(int k) {
        head = reverseK(head, k);
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Main4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            list.insert(sc.nextInt());
        }

        int k = sc.nextInt();

        list.reverseInGroups(k);

        list.display();

        sc.close();
    }
}