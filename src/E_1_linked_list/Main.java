package E_1_linked_list;

import java.util.HashMap;

public class Main {
    public static Node engine = null;
    /*for merging of two sorted  LL to one LL use engine1
    public static Node engine1 = null;*/
    public static void main(String[] args) {
       addEnd(4);
        addEnd(3);
        addEnd(7);
        addEnd(2);
        addEnd(5);
        print(engine);
        print(mergeSort(engine));

       /* Node n1=new Node(2,null);
        Node n2=new Node(4,null);
       // Node n5=new Node(6,null);
        //Node n4=new Node(7,null);
        engine1=n1;
        n1.next=n2;
        //n2.next=n5;
        //n5.next=n4;
        print(engine1);
        Node n3=sortedMerge(engine,engine1);
        print(n3);
        System.out.println(middle(n3).data);*/


    }
//------------------------------------------------------
//              Basic tasks in Linked List
//------------------------------------------------------
// print all the node data till the end
    public static void print(Node engine){
      //if no NODE is created
        if(engine==null) {
            System.out.println(engine);
            return;
        }
     // checking from engine(first Node)!=null till end
        Node t=engine;//
        while(t!=null){
            System.out.print(t.data);
     // Shifting to next node
            t=t.next;
            if(t!=null)
                System.out.print("-->");
        }
        System.out.println();
}
//Adding the New Node at the start of the list
    public static void addFront(int x){
        if(engine==null){
            Node newNode =new Node(x,null);
            engine=newNode;
            return;
        }
        Node newNode=new Node(x,engine);
        engine=newNode;
    }
    public static void addEnd(int x){
        if(engine==null){
            Node newNode =new Node(x,null);
            engine=newNode;
            return;
        }
        Node t=engine;
        while (t.next!=null){
            t=t.next;}
        Node newNode=new Node(x,null);
                t.next=newNode;
    }
    public static int deleteFront(){
        if(engine == null){
            System.out.println("no Node found");
            return -1;
        }
        System.out.println(engine.data);
        int temp=engine.data;
        engine=engine.next;
        return temp;
    }
    public static int deleteEnd() {
       if (engine == null) {
           return -1;
       }else if(engine.next==null){
           int temp=engine.data;
           engine=null;
           return temp;
       }
       Node t,prev;
       t=engine;
       prev=null;
       while (t.next!=null){
           prev=t;
           t=t.next;
       }
       int temp =t.data;
       prev.next=null;
       return temp;

   }
    public static void addAfter(int data, int x) {
        Node t = engine;
        while (t != null) {
            if (t.data == data) {
                break;
            }
            t = t.next;
        }
        if (t != null) {
            Node newNode = new Node(x, t.next);
            t.next = newNode;
        }
    }
    public static int deleteAfter(int data){
        Node t= engine;
        if(engine == null){
            System.out.println("no Node found");
            return -1;
        }else {
            while (t.next != null) {
                if (t.data == data) {
                    break;
                }
                t = t.next;
            }
        }
        if(t.next==null){
            return -1;
        } else{
            int temp=t.next.data;
            t.next=t.next.next;
            return temp;
        }
    }
//-------------------------------------------------------
//            Home Work
//-------------------------------------------------------
    public static void searchForNode(int data){
        Node t=engine;
        while(t!=null){
            if(t.data==data){
                System.out.println("data found");
                break;
            }
            t=t.next;
        }
    }
    public static void returnTheNthElement(int n){
  //n(starting from 0 to n-1
            Node t= engine;
            while(n>0){
                t=t.next;
                n--;
            }
        System.out.println(t.data);
    }
    public static void reverseList(){
        Node current=engine;
        Node previous=null;
        Node next=null;
        while (current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current = next;
        }
        engine=previous;
    }
    static public void removeDuplicates() {
        /*Another reference to head*/
        Node curr = engine;

        /* Traverse list till the last node */
        while (curr != null) {
            Node temp = curr.next;
            /*Compare current node with the next node and
            keep on deleting them until it matches the current
            node data */
            while(temp!=null && temp.data==curr.data) {
                temp = temp.next;
            }
            /*Set current node next to the next different
            element denoted by temp*/
            curr.next = temp;
            curr = curr.next;
        }
    }
    public static void removeLoop(){
        HashMap<Integer,Integer> map=new HashMap<>();
        if(engine==null){
            return;
        }else if(engine.next==engine){
            engine.next=null;
        }else{
            Node t=engine;
            while(t!=null){
                if(map.containsKey(t.next.data)){
                    break;
                }else{
                    map.put(t.next.data,1);
                }
               t=t.next;
            }
            t.next=null;
        }
    }
//----------------------------------------------------
//divide and conquo
    public static Node mergeSort(Node h){
        // Base case : if head is null
        if (h == null || h.next == null) {
            return h;
        }

        // get the middle of the list
        Node middle = middle(h);
        Node nextofmiddle = middle.next;

        // set the next of middle node to null
        middle.next = null;

        // Apply mergeSort on left list
        Node left = mergeSort(h);

        // Apply mergeSort on right list
        Node right = mergeSort(nextofmiddle);

        // Merge the left and right lists
        Node sortedlist = sortedMerge(left, right);
        return sortedlist;
    }
    public static Node middle(Node a){
        if(a==null)
            return a;
        Node slow=a;
        Node fast=a;
        while ((fast.next!=null)&&(fast.next.next!=null)){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static Node sortedMerge(Node a,Node b){
        if(a==null)
            return b;
        if(b==null)
            return a;
        Node result=null;
        if(a.data<=b.data) {
            result = a;
            result.next = sortedMerge(a.next, b);
        }
        else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;

    }
}



