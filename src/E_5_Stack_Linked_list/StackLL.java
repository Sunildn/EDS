package E_5_Stack_Linked_list;

public class StackLL {
    /** STACKS USING LINKED LIST
     * -->HEAD is used as top pointer to the last data**
     * -->LIFO is implemented using addFront and deleteFront
     * -->PUSH is implemented using addFront***
     * -->POP is implemented using deleteFront*****
     */
    //Just head is required for top and list are random size
    public static Node head=null;
//========Basic Functions of stack================
    public boolean isEmpty(){
        if(head==null)
            return true;
        return false;
    }
    public void push(int x){
        //addFront is implemented
        Node newNode=new Node(x,null);
        if(head==null){
            head=newNode;
        }else{
            Node t=head.next;
            newNode.next=head;
            head=newNode;
        }
  }
    public int pop(){
        //deleteFront is implemented
        if(isEmpty()){
            System.out.println("Stack underflow");
        return -99;}
        else {
            int temp = head.data;
            head = head.next;
            return temp;
        }
  }
    public int peek(){
        if(isEmpty()){
            System.out.println("Underflow");
        return -99;
        }else{
        //head is the top
            return head.data;
        }
  }
    public void print(){
        if(isEmpty()){
            System.out.println("Stack EMPTY");
            return;
        }else{
            Node t= head;
            while(t!=null){
                System.out.print(t.data);
                t=t.next;
                if(t!=null)
                    System.out.print("-->");
            }
            System.out.println();
        }


  }

}
