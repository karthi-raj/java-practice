import java.util.*;

class stack {

    int arr[];
    int top;
    int size;

    // Constructor
    stack(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

 
    void push(int data) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        top++;
        arr[top] = data;
    }

    
    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int value = arr[top];
        top--;
        return value;
    }

    
    void dis() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();   
        stack S = new stack(size);

        int n = sc.nextInt();     

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            S.push(val);
        }

        S.dis();

        System.out.println("Popped: " + S.pop());

        S.dis();
    }
}