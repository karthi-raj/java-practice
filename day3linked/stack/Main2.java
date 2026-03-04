//(insermid) in stack push

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
   
   void insertmid(int val){
      Node newNode=new Node(val);
      if(top==null){
         top=newNode;
         return;
      }
      Node fast=top;
      Node slow=top;
      Node prev=null;
      while(fast!=null && fast.next!=null){
         prev=slow;
         slow=slow.next;
         fast=fast.next.next;
         if(prev!=null){
            prev.next=newNode;
         }else{
            top=newNode;
         }
         newNode.next=slow;
         
      }
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
public class Main2{
	public static void main(String[] args) {
	   Scanner sc= new Scanner(System.in);
	   int n=sc.nextInt();
	   Stack stack=new Stack();
	   for(int i=0;i<n;i++){
	      int val=sc.nextInt();
	      stack.push(val);
	   }
	   int mid=sc.nextInt();
	   stack.insertmid(mid);
		System.out.println("");
		stack.display();
		sc.close();
	}
}