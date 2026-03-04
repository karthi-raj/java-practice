import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}

class Stack {
    Node top;

    Stack() {
        top = null;
    }

    
    void push(int val) {
        Node newNode = new Node(val);
        newNode.next = top;
        top = newNode;
    }

   
    void pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println("Popped: " + top.data);
        top = top.next;
    }

 
    void peek() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Top element: " + top.data);
    }

   
    void display() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return;
        }

        Node temp = top;
        
        System.out.print("Stack: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();

        int n = sc.nextInt(); 

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            stack.push(val);
        }

        stack.display();  
        stack.peek();     
        stack.pop();      
        stack.display();  

        sc.close();
    }
}