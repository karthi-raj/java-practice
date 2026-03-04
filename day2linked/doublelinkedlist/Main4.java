//delete beginning

import java.util.*;
class Node{
    int data;
    Node prev;//add
    Node next;
    Node(int val){
      this.data=val;
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
    
    void deleteBegin(){
      if(head==null){
         System.out.println("List is empty");
         return;
      }
      System.out.println("Deleted: "+head.data);
      head=head.next;
      if(head!=null){//add 
      head.prev=null; //add   
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
public class Main4{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      LinkedList list=new LinkedList();
      int n=sc.nextInt();
      System.out.println("Enter elements:");
      for(int i=0;i<n;i++){
         int val=sc.nextInt();
         list.insertend(val);
      }
      list.deleteBegin();
      list.display();
      sc.close();
    }
}