package com.demp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //decimalToBinary(5);
        //  binaryToDecimal("111");
        // addingWithoutSum(10,20);
        // decimalToOctal(200);
        //octalToDecimail("310");
        //System.out.println(reverseBits(5));
        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator();
        int m, n, options;
        do {
            System.out.println("1.Addition\t2.Substraction\t3.primeCheck\t4.factorial\t5.sum and max");
            System.out.println("6.lonely\t7.noOfBits\t8.gcd");
            options = input.nextInt();
            switch (options) {
                case 1:
                    System.out.println("Enter two nos");
                    m = input.nextInt();
                    n = input.nextInt();
                    System.out.println("addition of two nos is" + calculator.addition(m, n));
                    break;
                case 2:
                    System.out.println("Enter two nos");
                    m = input.nextInt();
                    n = input.nextInt();
                    System.out.println("addition of two nos is" + calculator.subtraction(m, n));
                    break;
                case 3:
                    System.out.println("Enter no");
                    m = input.nextInt();
                    if (calculator.primeCheck(m))
                        System.out.println("No is prime");
                    else
                        System.out.println("no is not a prime");
                    break;
                case 4:
                    System.out.println("Enter no");
                    m = input.nextInt();
                    calculator.factorial(m);
                    break;
                case 5:
                    System.out.println("Enter no");
                    m = input.nextInt();
                    calculator.sumAndMax(m);
                    break;
                case 6:
                    System.out.println("Enter no");
                    int[] d = {1, 2, 3, 1, 5, 2, 3};
                    System.out.println(calculator.lonely(d));
                    break;
                case 7:
                    System.out.println("Enter no");
                    m = input.nextInt();
                    System.out.println(calculator.noOfBits(m));
                    break;
                case 8:
                    System.out.println("Enter two nos");
                    m = input.nextInt();
                    n = input.nextInt();
                    System.out.println("addition of two nos is" + calculator.gcd(m, n));
                    break;
                default:
                    System.out.println("Enter the valid input ");
                    break;
            }
        } while (options > 0);

    }
}
