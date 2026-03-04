// import java.util.*;
// class Node{
//     int data;
//     Node next;
//     Node(int data){
//       this.data=data;
//       this.next=null;
//     }
// }



// class ll{
//     Node head;
   
//     void insert(int data){
//       Node newNode=new Node(data);
//          if(head==null){
//             head=newNode;
//             return;
//          }
//          Node temp=head;
//          while(temp.next!=null){
//             temp=temp.next;
//          }
//             temp.next=newNode;
//       }
      
      
//       void rev(){
//          Node prev=null;
//          Node curr=head;
//          Node next=null;
//          while(curr!=null){
//             next=curr.next;
//             curr.next=prev;
//             prev=curr;
//             curr=next;
//          }
//          head=prev;
//       }
      
 
      
//       void dis(){
//          Node temp=head;
//          while(temp!=null){
//             System.out.print(temp.data+" ");
//             temp=temp.next;
//          }
//          System.out.println("null");
         
//       }
//     }
   

//     public class Main1{
//       public static void main(String[]args){
//          Scanner sc=new Scanner(System.in);
//          int n=sc.nextInt();
//          ll L=new ll();
//          for(int i=0;i<n;i++){
//             int val=sc.nextInt();
         
//          L.insert(val);
              
//       }
//       L.rev();
//       L.dis();
//     }
//     }