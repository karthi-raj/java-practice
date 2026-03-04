//insert beginning

import java.util.*;
class Node{
    int data;
    Node next;
    Node(int val){
      this.data=val;
      this.next=null;
    }
}
class LinkedList{
    Node head;
    void insertBegin(int val){
      Node newNode=new Node(val);
      newNode.next=head;
      head=newNode;
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
public class Main{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      LinkedList list=new LinkedList();

     
      int n=sc.nextInt();

      System.out.println("Enter elements:");
      for(int i=0;i<n;i++){
         int val=sc.nextInt();
         list.insertBegin(val);
      }

      System.out.print("List: ");
      list.display();
      sc.close();
    }
}