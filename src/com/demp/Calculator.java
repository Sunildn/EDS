package com.demp;

public class Calculator {
    public int       addition(int a, int b) {
        return a + b;
    }
    public int       subtraction(int a, int b) {
        return a - b;
    }
    public boolean   primeCheck(int n) {
        boolean b = true;
        if (n <= 1)
            return false;

            // Check if number is 2
        else if (n == 2)
            return true;

            // Check if n is a multiple of 2
        else if (n % 2 == 0)
            return false;

        // If not, then just check the odds
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public void      factorial(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            while (n%i==0){
                System.out.print(i);
                if(n!=i){
                    System.out.print("x");
                }n/=i;
            }
        }
        if(n>2)
            System.out.println(n);
        System.out.println();
    }
    public void      sumAndMax(int m){
        int sum =0;
        int max=0;
        while (m!=0){
            if(max < m%10)
                max =m%10;
            sum+=m%10;
            m/=10;
        }
        System.out.println("sum ="+sum+"\tmax="+max);
    }
    public int       lonely(int[] a){
        int b=a[0];
        for (int i=1;i<a.length;i++){
            b^=a[i];
        }
        return b;
    }
    public int       noOfBits(int m){
        int noOfBit =((int)(Math.floor(Math.log(m)/Math.log(2)))+1);
        //int noOfBit=0;
       // while()
        return  noOfBit;
    }
    static int       setAllRangeBits(int N , int L , int R) {
        // code here
       /* int bits= (int)(Math.log(N)/Math.log(2))+1;
        int[] a =new int[bits];
        for(int i=bits-1;i>=0;i--){
            a[i]=N%2;
            N/=2;
        }
        for(int i=L;i<=R;i++){
            a[i]=1;
        }
        int num=0;
        int product =1;
        for(int i=bits-1;i>=0;i--){
            num=a[i]*product+num;
            product *=2;
        }*/
        int range=(((1<<(L-1)-1))^((1<<R)-1));
        return N|range;
    }
    public int       gcd(int a, int b){
        int gcd =0;
        for (int i=Math.max(a,b);i>=1;i--){
            if(((a%i==0)&&(b%i==0))){
                gcd =i;
                break;
            }
        }
        return gcd;

    }
    static int       swapBits(int x, int p1, int p2, int n) {
        int set1 = (x >> p1) & ((1 << n) - 1);
        // Move all bits of second set
        // to rightmost side
        int set2 = (x >> p2) & ((1 << n) - 1);
        // XOR the two sets
        int xor = (set1 ^ set2);
        // Put the xor bits back to
        // their original positions
        xor = (xor << p1) | (xor << p2);
        // XOR the 'xor' with the original number
        // so that the  two sets are swapped
        int result = x ^ xor;
        return result;

    }
    public  void    PrintAllTheBits(int n,String str){

        if(n==0){
            System.out.println(str);
            return;
        }
        PrintAllTheBits(n-1,str+"0");
        PrintAllTheBits(n-1,str+"1");
    }


    }

