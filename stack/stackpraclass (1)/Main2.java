// //check for balanced parantheses in an expression using a stack.

// import java.util.*;

// class Node {
//     char data;
//     Node next;

//     Node(char data) {
//        this.data = data;
//        this.next = null;
//     }
// }

// class Stack {

//     Node top;

//     void push(char c) {
//        Node newNode = new Node(c);
//        newNode.next = top;
//        top = newNode;
//     }

//     char pop() {
//        char value = top.data;
//        top = top.next;
//        return value;
//     }

//     boolean isEmpty() {
//        return top == null;
//     }

    
//     boolean balanced(String st) {

//        for (int i = 0; i < st.length(); i++) {

//             char ch = st.charAt(i);

//             if (ch == '(' || ch == '{' || ch == '[') {
//                 push(ch);
//             }

//             else if (ch == ')' || ch == '}' || ch == ']') {

//                 if (isEmpty()) {
//                    return false;
//                 }

//                 char topChar = pop();

//                 if ((ch == ')' && topChar != '(') ||
//                    (ch == '}' && topChar != '{') ||
//                    (ch == ']' && topChar != '[')) {
//                    return false;
//                 }
//             }
//        }

//        return isEmpty();
//     }
// }

// public class Main2 {

//     public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        String st = sc.nextLine();

//        Stack stack = new Stack();

       
//        if (stack.balanced(st))
//             System.out.println("Balanced");
//        else
//             System.out.println("Not Balanced");
//     }
// }