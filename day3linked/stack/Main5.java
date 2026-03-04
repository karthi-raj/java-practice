//(deleteatmiddle)in stack


import java.util.*;
class Node{
    int data;
    Node next;
   
    Node(int data){
      this.data=data;
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
   
    void deleteMid() {
        
       if (top == null || top.next == null) {
            System.out.println("Not enough nodes");
            return;
       }
     
       Node slow =top;  
       Node fast = top;  
       Node prev = null; 
       while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
       }
       System.out.println("Deleted node: " + slow.data);
       prev.next = slow.next;
    }
    
    
void display() {
       Node temp = top;
       while (temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
       }
       System.out.println("null");
    }
}
public class Main5 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
    Stack stack = new Stack();
       int n = sc.nextInt();
       for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            Stack.insertend(val);
       }
       Stack.deleteMid();
       System.out.print("  ");
       Stack.display();
    }
}