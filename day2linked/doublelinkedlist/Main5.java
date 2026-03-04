delete mid 


import java.util.*;
class Node{
    int data;
    Node prev;//
    Node next;
   
    Node(int data){
      this.data=data;
      this.next=null;
      this.prev=null;//
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
    newNode.prev=temp;//
    }
   
    void deleteMid() {
        
         if (head == null || head.next == null) {
            System.out.println("Not enough nodes");
            return;
         }
     
         Node slow = head;  
         Node fast = head;  
         Node prev = null; 
         while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
         }
         System.out.println("Deleted node: " + slow.data);
         prev.next = slow.next;
         if(slow.next!=null){//
         slow.next.prev=prev;//
         }
    }
    
    
    
    
    
void display() {
         Node temp = head;
         while (temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
         }
         System.out.println("null");
    }
}
public class Main5{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         LinkedList list = new LinkedList();
         int n = sc.nextInt();
         for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            list.insertend(val);
         }
         list.deleteMid();
         System.out.print("  ");
         list.display();
    }
}