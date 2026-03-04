//SORT A STACK USING RECURRSION

import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int val) {
         this.data = val;
         this.next = null;
    }
}
class Stack {
    Node top;
    
    void push(int val) {
         Node newNode = new Node(val);
         newNode.next = top;
         top = newNode;
    }
    
    int pop() {
         if (top == null) {
            return -1;
         }
         int val = top.data;
         top = top.next;
         return val;
    }
    
    int peek() {
         if (top == null)
            return -1;
         return top.data;
    }
    
    boolean isEmpty() {
         return top == null;
    }
    
    void display() {
         Node temp = top;
         while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
         }
         System.out.println();
    }
    
    void sortStack() {
         if (!isEmpty()) {
            int temp = pop();
            sortStack();
            insertSorted(temp);
         }
    }
    void insertSorted(int value) {
         if (isEmpty() || value > peek()) {
            push(value);
            return;
         }
         int temp = pop();
         insertSorted(value);
         push(temp);
    }
}

public class Main3 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         Stack s = new Stack();
         for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            s.push(val);
         }
         s.sortStack();
         s.display();
         sc.close();
    }
}