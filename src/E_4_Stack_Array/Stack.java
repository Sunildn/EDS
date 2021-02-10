package E_4_Stack_Array;

import java.util.Arrays;

public class Stack {
    /** We can only insert data and take data out of the Stack from the ‘top’ of the Stack.
    *  Formally,these operations are known as ‘push’ (inserting data) and ‘pop’ (taking data out).
    *  As we can understand, at any given time, we can access only one data element in the data structure.
     *  LIFO(last in first out)
     *  ---------------------------
     *  -->Push-to add data to stack
     *  -->pop-to remove data from stack.
     *  -->peek – To ‘peek’ at the top element in the Stack
     *  -->isEmpty – To check if the Stack is empty or not
     *  -->isFull – To check if the Stack is full or not
     */
    //====================ATTRIBUTES=================================
    //In stack top is the index of the element at the top of the stack
    private int top;
    //private because array should not be accessed by index
    //Array should be accessed by top
    private int[] stackArray;
    //=====================METHODS===================================
    //Creating the stack of Array by creating new array of entered size
    public void create(int x){
    top=-1;
    stackArray=new int[x];
    }
    //If stack is empty then print nothing else print all the elements
    public void print(){

        System.out.println(Arrays.toString(stackArray));
    }
    //Check for the TOP if its equal to size then stack is full
    public boolean isFull(){
        if(top==stackArray.length-1){
            return true;
        }else
        return false;
    }
    //Check for the TOP if its equal to -1 then stack is empty
    public boolean isEmpty(){
        if(top==-1)
            return true;
        else
        return false;
    }
    //Add the element to the stack at top+1 index
    public void push(int x) {
        if (isFull()) {
            System.out.println("stack overflow");
        } else {
            /** important*/
            stackArray[++top] = x;
            System.out.println("Pushed successfully");
        }
    }
    //deleting the element at the top index and reduce the top
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack underflow");
            return -99;
        }else{
            return stackArray[top--];
        }
    }
    //Return the value at the top index
    public int peek(){

        return stackArray[top];
    }

}
