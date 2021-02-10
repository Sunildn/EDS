package E_2_Circular_LL;

import E_5_Stack_Linked_list.Node;

import java.util.Scanner;

public class Main {


    public static CircularNode head=null;
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("enter no of nodes ");
        int n=input.nextInt();
        for(int i=0;i<n;i++){
            addEnd(input.nextInt());
        }
       print();
        //reverse();
        printKthNode(20);
        print();
        addFront(6);
        print();
    }
//---------------------------------------------------------------
//                 Basic Operations for Circular Linked List
//---------------------------------------------------------------
// Print the data in each node
        public static void print(){
        if(head ==null){
            System.out.println("no data found");
            return;}
        CircularNode t=head;
 //here do while loop because t is pointing to the head so while loop wont become true
        do{
            System.out.print(t.data);
            if(t.next!=head)
                System.out.print("-->");
            t=t.next;
        }while(t!=head);//'t' will be at the same node
            System.out.println();
    }
// Add the elements at the end of the list
        public static void addEnd(int x){
        //check if list is null
        if(head==null){
            CircularNode newNode= new CircularNode(x,null);
            head=newNode;
        // If one Node is present then its NEXT should point to head
            newNode.next=head;
        }
        else {
            CircularNode t = head;
        // This is compulsory  to stay at the last node  point and to point back to the HEAD
            while (t.next != head) {
                t = t.next;
            }
        // newNode1 should point to Head
            CircularNode newNode1 = new CircularNode(x, head);
        //previous last node should point to newNode1
            t.next = newNode1;
        }
        }
//Deleting  last Node of  the list
        public static void deleteEnd(){
        //if NO nodes are there to delete exit from the method
        if(head!=null){
            CircularNode t= head;
        //Its mandatory to maintain previous node for deleting the last node
            CircularNode prev= null;
            if(t.next==head){
                head=null;
                return;
            }
        //While loop to reach last node
            while(t.next!=head) {
                prev = t;
                t = t.next;
            }
        //After deleting the last node previous node should point to the HEAD
                prev.next=head;
            }
        }
//Adding the NODE after Head
        public static void addFront(int x){
        CircularNode newNode=new CircularNode(x,null);
        //if list is empty
        if(head==null){
            head=newNode;
            newNode.next=head;
        }else{
         //last node should point to the head after adding a node so while loop to go to last node
            CircularNode t=head;
            do{
                t=t.next;
            }while (t.next!=head);
            CircularNode temp=head;
            newNode.next=temp;
            head=newNode;
        //Assign last node.next to head after assigning the head to new node
            t.next=head;

        }



        }
//Deleting the first node after head
        public static void deleteFront(){
        if(head!=null){
            CircularNode temp=head.next;
            CircularNode t= head;
            do{
                t=t.next;
            }while(t.next!=head);
        //head should point to the second node
            head=temp;
        // reassigning the last node.next to head
            t.next=head;

        }
        }
//Adding  a node after a given node
        public static void addAfter(int data,int x){

        if(head!=null){
            CircularNode t=head;
            do{
                t=t.next;
            }while(t.data!=data);
            if(t.next==head){
                CircularNode newNode=new CircularNode(x,null);
                t.next=newNode;
                newNode.next=head;
            }else{
                CircularNode newNode=new CircularNode(x,null);
                CircularNode temp =t.next;
                t.next=newNode;
                newNode.next=temp;
            }

        }
        }
//Delete  a node after a given node
    public static  void deleteAfter(int data){
        if(head!=null){
            CircularNode t=head;
            do{
                t=t.next;
            }while(t.data!=data);
            if(t.next==head)
                return;
            CircularNode temp=t.next;
            t.next=t.next.next;
        }
        }
//----------------------------------------------------------------
//          Other functions on Circular Linked list
//---------------------------------------------------------------
    public static  void searchingNode(int data){
        CircularNode t=head;
        do{
           if(t.data==data){
               System.out.println("data found");
               return;}
           t=t.next;
        }while(t.next!=head);
    System.out.println("data not found");
    }
    public static void reverse(){
        if(head==null){
            System.out.println("Node empty");
        }else{
            CircularNode curr=head;
            CircularNode prev=null;
            CircularNode next=null;
            do{
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }while(curr!=head);
            head.next=prev;
            head=prev;
        }
    }
    public static void printKthNode(int k){
        if(k==0 ||head.next==head){
            System.out.println(head.data);
            return;
        }else {
            CircularNode t=head;
            for(int i=0;i<k;i++){
                t=t.next;
            }
            System.out.println(t.data);
        }
    }

        }




