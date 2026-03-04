//insert atbegin in doublelinkedlist


import java.util.Scanner;
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
    void insertBegin(int val){
      Node newNode=new Node(val);
      newNode.next=head;
      if(head!=null){//add
      head.prev=newNode; //add
      }
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
public class Main2{
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