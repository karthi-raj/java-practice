
// //Reverse a string using a linkedlist;

// import java.util.*;
// class Node {
//     char data;
//     Node next;

//     Node(char data) {
//        this.data = data;
//        this.next = null;
//     }
// }

// class stack {

//     Node top;

//     void push(char data) {
//        Node newNode = new Node(data);
//        newNode.next = top;
//        top = newNode;
//     }

//     char pop() {
//        if (top == null) {
//             return '0';
//        }

//        char value = top.data;
//        top = top.next;
//        return value;
//     }

//     boolean isEmpty() {
//        return top == null;
//     }
// }

// public class Main1 {

//     public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        stack S = new stack();

//        String str = sc.nextLine();

       
//        for (int i = 0; i < str.length(); i++) {
//             S.push(str.charAt(i));
//        }

        
//        while (!S.isEmpty()) {
//             System.out.print(S.pop());
//        }
//     }
// }