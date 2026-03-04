(delete) pop beginning in stack


import java.util.*;
class Node{
    int data;
    Node next;
    Node(int val){
      this.data=val;
      this.next=null;
    }
}
class Stack{
    Node top;

    void push(int val){
      Node newNode=new Node(val);
      if(top==null){
         top=newNode;
         return;
      }
      Node temp=top;
      while(temp.next!=null){
         temp=temp.next;
      }
      temp.next=newNode;
    }
    
    void pop(){
      if(top==null){
         System.out.println("stack is empty");
         return;
      }
      System.out.println("Deleted: "+top.data);
      top=top.next;
    }



    void display(){
      Node temp=top;
      while(temp!=null){
         System.out.print(temp.data+" ");
         temp=temp.next;
      }
      System.out.println("null");
    }
}
public class Main3{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
    Stack stack=new Stack();
      int n=sc.nextInt();
      System.out.println("Enter elements:");
      for(int i=0;i<n;i++){
         int val=sc.nextInt();
         stack.push(val);
      }
      stack.pop();
      stack.display();
      sc.close();
    }
}