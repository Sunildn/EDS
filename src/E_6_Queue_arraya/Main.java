package E_6_Queue_arraya;

import E_4_Stack_Array.Stack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       /* Scanner input= new Scanner(System.in);
        QueueA queue=new QueueA();
        int x,option;
        boolean flag;
        String s;
        do{
            System.out.println("Please select the options");
            System.out.println("1.Create\t2.enqueue\t3.dequeue");
            System.out.println("4.isEmpty\t5.isFull\t");
            System.out.println("6.Peek\t7.print\t100.Exit");
            option=input.nextInt();
            switch (option){
                case 1:
                    System.out.println("Enter the size of the queue");
                    x=input.nextInt();
                    queue.create(x);

                    break;
                case 2:
                    System.out.println("Enter the Value to be pushed to stack");
                    x=input.nextInt();
                    queue.enqueue(x);
                    System.out.println(x+" enqueued successfully");
                    break;
                case 3:
                    x=queue.dequeue();
                    if(x==-1){
                        System.out.println("Stack underflow");
                    }else
                        System.out.println("The value popped from stack is"+x);
                    break;
                case 4:
                    flag=queue.isEmpty();
                    if(flag)
                        System.out.println("Stack is EMPTY");
                    else
                        System.out.println("Stack is NOT EMPTY");
                    break;
                case 5:
                    flag=queue.isFull();
                    if(flag)
                        System.out.println("Stack is FULL");
                    else
                        System.out.println("STack is NOT FULL");

                    break;
                case 6:
                    x=queue.peek();
                    if(x!=-1)
                        System.out.println( "The value at the top is"+x);
                    break;
                case 7:
                    queue.print();
                    break;

                case 100:
                    System.out.println("Thank you for using stack");
                    break;
            }

        }while(option!=100);*/
        Queue m =new Queue();
        m.enqueue(1);
        m.enqueue(2);
        m.enqueue(3);
        System.out.println(m.toString());
    }
}
