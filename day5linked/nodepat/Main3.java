// import java.util.*;
// class Node{
//   int data;
//   Node next;
//   Node(int data){
//       this.data=data;
//       this.next=null;
//   }
// }
// class ll{
//   Node head;
   
   
//   void insert(int data){
//       Node newNode=new Node(data);
//          if(head==null){
//             head=newNode;
//             return;
//          }
//          Node temp=head;
//          while(temp.next!=null){
//             temp=temp.next;
//          }
//          temp.next=newNode;
//       }
//       void Knode(){
         
//       }
   
   
   
//   void kthFromStart(int k) {
//     Node temp = head;
//     int count = 1;
//     while (temp != null) {
//         if (count == k) {
//             System.out.println(temp.data);
//             return;
//         }
//         count++;
//         temp = temp.next;
//     }
//     System.out.println("Invalid Position");
// }

// void display(){
//   Node temp=head;
//   while(temp!=null){
//       System.out.print(temp.data);
//       temp=temp.next;
//   }
//   System.out.print("null");
// }
// }
// public class Main{
//   public static void main(String[]args){
//       Scanner sc= new Scanner(System.in);
//       int n=sc.nextInt();
//       ll L=new ll();
//       for(int i=0;i<n;i++){
//          int val=sc.nextInt();
//          L.kthFromStart();
//       }
//       L.display();
//   }
// }