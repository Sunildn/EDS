package com.demp;
import java.util.*;

public class BitManuplation {
//--------------Decimal to binary-----------------------
    public static void decimalToBinary(int a) {
        int[] binary = new int[50];
        int index = 0;
        while (a > 0) {
            binary[index] = a % 2;
            a = a / 2;
            index++;
        }
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }
    public static void binaryToDecimal(String a) {
        int product = 1;
        int sum = 0;
        for (int i = a.length() - 1; i >= 0; i--) {
            char c = a.charAt(i);
            int m = Integer.parseInt(String.valueOf(c));
            sum = m * product + sum;
            product = product * 2;
        }
        System.out.println(sum);
    }

//--------------Octal to Decimal-------------------------

    public static void decimalToOctal(int a) {
        int index = 0;
        int[] oct = new int[24];
        while (a > 0) {
            oct[index] = a % 8;
            a = a / 8;
            index++;
        }
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(oct[i]);
        }
    }
    public static void octalToDecimail(String s) {
        char c;
        int index = 0;
        int product = 1;
        int sum = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            c = s.charAt(i);
            int m = Integer.parseInt(String.valueOf(c));
            sum = m * product + sum;
            product *= 8;
        }
        System.out.println(sum);
    }

//-------------Adding nos without + sign-------------------

    public static void addingWithoutSum(int a, int b) {
    int carry = 0;
    while (b != 0) {
        carry = a & b;
        a = a ^ b;
        b = carry;
        b = b << 1;
    }
    System.out.println(a);
}
    public static int subtractBits(int num1, int num2) {
        while (num2 != 0)
        {
            // we first calculate the borrow
            int borrow = (~num1) & num2;
            // the difference is calculated as
            num1 = num1 ^ num2;
            // Now, borrow is shifted left by one so that subtracting it from
            // num1 gives the required difference
            num2 = borrow << 1;
        }
        return num1;
    }

//------------------reversing bits--------------------------
    public static int reversing(int m) {
        int[] a = new int[123];
        int index = 0;
        int product = 1;
        int sum = 0;
        while (m > 0) {
            a[index] = m % 2;
            m = m / 2;
            index++;
        }
        for (int i = index - 1; i >= 0; i--) {

            sum = a[i] * product + sum;
            product = product * 2;
        }
        return sum;

    }

    public static int reverseBits(int num) {
        int i = 0;
        while (num > 0) {
            //left shift by 1
            i <<= 1;
            // if the current bit is '1' then
            if ((int) (num & 1) == 1)
                i ^= 1;
            // num is shifted right by 1
            num >>= 1;
        }
        return i;
    }
}
