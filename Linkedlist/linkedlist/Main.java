
//insertmid

import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
      this.data=data;
      this.next=null;
    }
}
class LinkedList{
    Node head;
    
    
    void insertend(int val){
      Node newNode=new Node(val);
      if(head==null){
         head=newNode;
         return;
      }
    Node temp=head;
    while(temp.next!=null){
       temp=temp.next;
    }
    temp.next=newNode;
    }
    
    
    void insertmid(int val){
      Node newNode=new Node(val);
         if(head==null){
            head=newNode;
            return;
         }
      Node slow=head;
      Node fast=head;
      Node prev=null;
      while(fast!=null && fast.next!=null){
         prev=slow;
         slow=slow.next;
         fast=fast.next.next;
      }
      if(prev!=null){
         prev.next=newNode;
      }else{
         head=newNode;
      }
      newNode.next=slow;
         }
      
      // //two pointer methed   
      //  void insertmid(int val){
      //     Node newNode=new Node(val);
      //     if(head==null){
      //        head=newNode;
      //        return;
      //     }
      //     Node first=head;
      //     Node second=head;
      //     int count=0;
       
      //    while(second!=null && second.next!=null){
      //     second=second.next.next;
      //     count++;
      //  }
      //  for(int i=0;i<count-1;i++){
      //  first=first.next;
      // }
      // newNode.next=first.next;
      // first.next=newNode;
      // }
         
    void display(){
      Node temp=head;
      while(temp!=null){
         System.out.print(temp.data+" ");
         temp=temp.next;
      }
      System.out.println("null");
    }
}



public class Main{
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	    LinkedList list = new LinkedList();
	   for(int i=0;i<n;i++){
	      int val=sc.nextInt();
	      list.insertend(val);
	      
	   }
	   int mid=sc.nextInt();
	   list.insertmid(mid);
		System.out.println(" ");
	   list.display();
	   sc.close();
	}
}








