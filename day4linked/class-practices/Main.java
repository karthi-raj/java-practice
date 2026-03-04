
//Nth from of end node



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

  
    void nthFromEnd(int n){
      Node fast=head;
      Node slow=head;

      for(int i=0;i<n;i++){
         if(fast==null){
            System.out.println("n is greater than list size");
            return;
         }
         fast=fast.next;
      }

      while(fast!=null){
         fast=fast.next;
         slow=slow.next;
      }






      System.out.println("Nth node from end: "+slow.data);
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
      
      for(int i=0;i<n;i++){
         int val=sc.nextInt();
         list.insertend(val);
      }
     
      list.display();

      System.out.println(" ");
      int nth=sc.nextInt();
      list.nthFromEnd(nth);

      sc.close();
    }
}
