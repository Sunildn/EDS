package E_5_Stack_Linked_list;

import E_4_Stack_Array.Stack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StackLL stack = new StackLL();
        int x, option;
        boolean flag;
        do {
            System.out.println("Please select the options");
            System.out.println("1.Push\t2.pop");
            System.out.println("3.isEmpty\t4.Peek");
            System.out.println("5.print\t100.Exit");
            option = input.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter the Value to be pushed to stack");
                    x = input.nextInt();
                    stack.push(x);
                    System.out.println(x+"pushed into stack successfully");
                    break;
                case 2:
                    x = stack.pop();
                    if (x == -99) {
                        System.out.println("Stack underflow");
                    } else
                        System.out.println("The value popped from stack is" + x);
                    break;
                case 3:
                    flag = stack.isEmpty();
                    if (flag)
                        System.out.println("Stack is EMPTY");
                    else
                        System.out.println("Stack is NOT EMPTY");
                    break;
                case 4:
                    x = stack.peek();
                    if (x != -99)
                        System.out.println("The value at the top is" + x);
                    break;
                case 5:
                    stack.print();
                    break;
                case 100:
                    System.out.println("Thank you for using stack");
                    break;
            }

        } while (option != 100);
    }
}
