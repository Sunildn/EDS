package E_3_Double_LL;

public class Main {
    static class Node {
        /*Node contains reference to two nodes, one before it and one after it as you do in a doubly linked list*/
        int data;
        Node next;
        Node prev;

        Node(int d) {
            data = d;
            next = null;
        }
    }
    public static Node head1=null;
    public static DoubleNode head=null;
    public static  void main(String[] args){
        addFront(1);
        addFront(2);
        addFront(3);
        addFront(4);
        print();
        delete(1);
        print();
    }
//-------------------------------------------------------------------------
//           Basic tasks to do with Double linked list
//-------------------------------------------------------------------------
// Print all the Node data in the DLL
    public static void print(){
        if(head == null){
            System.out.print("Data not found");
            return;
        }else{
            DoubleNode t=head;
            while(t!=null){
                System.out.print(t.data);
                if(t.next!=null){
                    System.out.print("-->");
                }
                t=t.next;
            }
        }
        System.out.println();
    }
//Add new node after head
    public static void addFront(int x){
        DoubleNode newNode=new DoubleNode(x,null,null);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head.previous=newNode;
        head=newNode;
    }
//Delete the first node
    public static  void deleteFront(){
        int temp;
        if(head==null)
            temp= -99;
        else if(head.next==null){
            temp=head.data;
    //if only one present;
            head=null;}
        else{
            temp= head.data;
            head.next.previous=null;
            head=head.next;
        }
        System.out.println("deleted data is :"+ temp);
    }
//Add Node to the list at last
    public static void addLast(int x){
        DoubleNode newNode = new DoubleNode(x,null,null);
        if(head==null){
            head=newNode;
            return;
        }
        DoubleNode t= head;
        while(t.next!=null){
            t=t.next;
        }
        t.next=newNode;
        newNode.previous=t;
}
//Delete the node at the end of the list
    public static void deleteEnd(){
        if(head!=null){
            if(head.next==null){
                head=null;
            }else{
                DoubleNode t=head;
                while(t.next!=null){
                    t=t.next;
                }
                t.previous.next=null;
            }
        }
    }
//Add after a give node
    public static void addAfter(int data,int x){
    DoubleNode newNode= new DoubleNode(x,null,null);
    if(head==null){
        head=newNode;
        return;
    }
    DoubleNode t=head;
    while(t.next!=null){
        if(t.data==data)
            break;
        t=t.next;
    }
    if(t.next==null){
        addLast(x);
        return;
    }
    newNode.next=t.next;
    t.next.previous=newNode;
    t.next=newNode;
    newNode.previous=t;
    }
//Delete any node
    public static void delete(int data){
        if(head==null){
            return;
        }
    //GO to the Node where the data is present
        DoubleNode t=head;
        while (t!=null){
            if(t.data==data)
                break;
            t=t.next;
        }
        if(t==null){
            System.out.println("element not found");
            return;
        }
        if(head==t){
            head=head.next;
        head.next.previous=null;
        return;}
        if(t.next==null)
            t.previous.next=null;
        else {
        t.previous.next=t.next;
        t.next.previous=t.previous;}
    }
//==========================================================
//          Circular Double linked list
//=========================================================

    static void push(int data) {
        Node new_node = new Node(data);
        // creating a new node with given data value from the user.
        /* if the head is null then it means for now the list is empty. In this case you should make the new node as head node
        and since the list to be created is doubly linked and circular linked therefore 'next' and 'prev' node would be the node
        itself */

        if (head1 == null) {
            new_node.data = data;
            new_node.next = new_node.prev = new_node;
            head1 = new_node;
            return;
        }
        // When the list is not empty
        else {
        /* To add a node at the end of the list, you have to go to the end of the list and for this you always travel the whole list
        but in this case the head is bidirectionally linked to the tail of the original list so you can directly jump there.*/

            Node tail = head1.prev;
            // the next of the new_node would point to head
            new_node.next = head1;
            // head should also has reference to new_node. The previous of head will point to the new_node.
            head1.prev = new_node;

            /*new_node is the new tail of the list since you are adding node at the end of the list. Therefore, the tail of
            the original list will now become the previous node of the new_node*/
            new_node.prev = tail;

            // tail's 'next' will now point to the new node
            tail.next = new_node;
        }
    }

     static void printC() {
        Node temp = head1;
        if (head1 == null) {
            System.out.println(" ");
        } else {
            /*Since the list has properties of circular linked list you have to print the data values till the temp again points to head*/
            while (temp.next != head1) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.print(temp.data + " ");
            /*for printing the data of the list in reverse direction you will start from the tail of the list.*/
            System.out.println("");
            Node tail = head1.prev;
            temp = tail;
            while (temp.prev != tail) {
                System.out.print(temp.data + " ");
                temp = temp.prev;
            }
            System.out.print(temp.data + " ");
        }
    }
}