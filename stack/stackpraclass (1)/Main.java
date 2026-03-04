// //implement a stack using likedlist


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
      
      
      
//       int pop(){
//        if (top == null) {
//             System.out.println("Stack Underflow");
//             return -1;
//        }

//        int value = top.data;
//        top = top.next;
//        return value;
//       }
      
      
      
//       void dis(){
//          Node temp=top;
//          while(temp!=null){
//             System.out.print(temp.data+" ");
//             temp=temp.next;
//          }
//          System.out.print("null");
//       }
//    }
//    public class Main{
//       public static void main(String[]args){
//          Scanner sc= new Scanner (System.in);
//           stack S=new stack();
//          int n=sc.nextInt();
//          for(int i=0;i<n;i++){
//             int val=sc.nextInt();
//             S.push(val);
//          }
//          S.dis();
//          System.out.println("poped  " +S.pop());
//          S.dis();
//       }
//    }