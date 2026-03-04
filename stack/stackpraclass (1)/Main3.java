// //convert an infix expression to a postfix expression using a stack
// import java.util.*;
// class Node{
//    int data;
//    Node next;
//    Node(int data){
//       this.data=data;
//       this.next=null;
//    }
// }
// class stack{
//    Node top;
   
//    void push(int data){
//    Node newNode=new Node(data);
//       newNode.next=top;
//       top=newNode;
//       }
//        int pop() {
//        int value = top.data;
//        top = top.next;
//        return value;
//     }

//     boolean isEmpty() {
//        return top == null;
//     }

    
//    String infixToPostfix(String exp) {

//        for (int i = 0; i < exp.length(); i++) {

//             char ch = exp.charAt(i);

          
//             if (Character.isDigit(ch)) {
//                 push(ch - '0');  
//             }
//    else {

//                 int val2 = pop();
//                 int val1 = pop();

//                 switch (ch) {

//                    case '+':
//                         push(val1 + val2);
//                         break;

//                    case '-':
//                         push(val1 - val2);
//                         break;

//                    case '*':
//                         push(val1 * val2);
//                         break;

//                    case '/':
//                         push(val1 / val2);
//                         break;
//                 }
//             }
//        }
    
//     return pop();
//    }
// }
//     public class Main3{
//        public static void main(String[]args){
//           Scanner sc=new Scanner(System.in);
//           stack S=new stack();
//           String exp=sc.nextLine();
//          //  for(int i=0;i<n;i++){
//          //     int val=sc.nextInt();
//          //  }           
//           String postfix = S.infixToPostfix(exp);

//        System.out.println("Postfix = " + postfix);
//        }
//     }


      