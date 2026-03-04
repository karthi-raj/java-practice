//insertat mid double


import java.util.*;
class Node{
    int data;
    Node prev;//add
    Node next;
    Node(int data){
      this.data=data;
      this.next=null;
      this.prev=null;//add
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
      newNode.prev=temp;//add
    }
    
    void insertmid(int val){
      Node newNode=new Node(val);
         if(head==null){
            head=newNode;
            return;
         }
      Node slow=head;
      Node fast=head;
      Node prev=null;//add
      while(fast!=null && fast.next!=null){
         prev=slow;
         slow=slow.next;
         fast=fast.next.next;
      }
      if(prev!=null){
         prev.next=newNode;
         newNode.prev=prev;//add
      }else{
         head=newNode;
         newNode.prev=null;//add
      }
      newNode.next=slow;
      if(slow!=null){//add
          slow.prev=newNode;//add
      }
         }
    void display(){
      Node temp=head;
      while(temp!=null){
         System.out.print(temp.data+" ");
         temp=temp.next;
      }
      System.out.println("null");
    }
}

public class Main3{
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
