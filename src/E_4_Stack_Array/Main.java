package E_4_Stack_Array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        Stack stack=new Stack();
        int x,option;
        boolean flag;
        String s;
        do{
            System.out.println("Please select the options");
            System.out.println("1.Create\t2.Push\t3.pop");
            System.out.println("4.isEmpty\t5.isFull\t");
            System.out.println("6.Peek\t7.print\t100.Exit");
            option=input.nextInt();
            switch (option){
                case 1:
                    System.out.println("Enter the size of the stack");
                    x=input.nextInt();
                    stack.create(x);
                    System.out.println("Stack created successfully");
                    break;
                case 2:
                    System.out.println("Enter the Value to be pushed to stack");
                    x=input.nextInt();
                    stack.push(x);

                    break;
                case 3:
                    x=stack.pop();
                    if(x==-99){
                        System.out.println("Stack underflow");
                    }else
                    System.out.println("The value popped from stack is"+x);
                    break;
                case 4:
                    flag=stack.isEmpty();
                    if(flag)
                        System.out.println("Stack is EMPTY");
                    else
                        System.out.println("Stack is NOT EMPTY");
                    break;
                case 5:
                    flag=stack.isFull();
                    if(flag)
                        System.out.println("Stack is FULL");
                    else
                        System.out.println("STack is NOT FULL");

                    break;
                case 6:
                    x=stack.peek();
                    if(x!=-99)
                    System.out.println( "The value at the top is"+x);
                    break;
                case 7:
                    stack.print();
                    break;
                case 8:
                    System.out.println("enter digit");
                     x=input.nextInt();
                    sortedInsert(stack,x);
                    stack.print();
                    break;
                case 9:
                    sort(stack);
                    break;
                case 100:
                    System.out.println("Thank you for using stack");
                    break;
            }

        }while(option!=100);
    }
    public static void sortedInsert(Stack s,int x){
        if(s.isEmpty()||x>s.peek()){
            s.push(x);
            return;
        }
        int temp=s.pop();
        sortedInsert(s,x);
        s.push(temp);
    }
    public static void sort(Stack s){
        if(s.isEmpty())
            return;
        else{
            int temp= s.pop();
            sort(s);
            sortedInsert(s,temp);
        }

    }
}
