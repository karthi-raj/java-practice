import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
      this.data=data;
      this.next=null;
    }
   
}


class ll{
    Node head;
   
    void insert(int data){
      Node newNode=new Node(data);
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
   
   
    void Nth(int n){
      Node fast=head;
      Node slow=head;
      for (int i=0;i<n;i++)
      {
         fast=fast.next;
      }
      while(fast!=null)
      {
         fast=fast.next;
         slow=slow.next;
      }
      System.out.println(slow.data);
    }


void display(){
    Node temp=head;
    while(temp!=null){
      System.out.print(temp.data+" ");
      temp=temp.next;
    }
    System.out.print("null");
 }
}



public class Main2{
    public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      int n= sc.nextInt();
      ll L=new ll();
      for(int i=0;i<n;i++){
         int val=sc.nextInt();
         L.insert(val);
      }
      int pos=sc.nextInt();
      L.Nth(pos);
      
    }
}

