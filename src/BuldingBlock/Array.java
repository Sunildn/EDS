package BuldingBlock;

import java.util.Arrays;

public class Array {
    //----------------------------------------------------------------------------
    //              UPGRAD Problems
    //----------------------------------------------------------------------------
    //Delete an element at a given index from the array
    public static int[] deleteAnElementInArray(int[] a, int k) {
        //k is index;
        int[] b = new int[a.length - 1];
        for (int i = 0, j = 0; (i < (a.length - 1)) | j < (b.length - 1); i++, j++) {
            if (i == (k)) {
                j--;
                continue;
            }
            b[j] = a[i];
        }
        return b;
    }

    //Write a program to find the top two maximum numbers in an array which is sorted and repetition
    //is not allowed
    public static void twoMaxNos(int[] a) {
        int max = a[0];
        int secondMax = a[1];
        for (int i = 2; i < a.length; i++) {
            if (max < a[i]) {
                secondMax = max;
                max = a[i];

            } else if (secondMax < a[i]) {
                secondMax = a[i];
            }
        }
        System.out.println(max + " " + secondMax);
    }

    //Find the first repeating number in an array.
    public static int firstNonRepeating(int arr[]) {
        //write your logic here
        int m = 0;
        for (int i = 0; i < arr.length; i++) {
            int j;
            for (j = 0; j <= arr.length - 1; j++) {
                if (i != j && arr[i] == arr[j])
                    break;
            }
            if (j == arr.length)
                return arr[i];

        }
        return -1;
    }

    //reversing the array
    public static void reverseAnArray(int[] a, int n) {
        int temp = 0;
        for (int i = 0; i < (n / 2); i++) {
            //swaping bits
            temp = a[i];
            a[i] = a[(n - 1) - i];
            a[(n - 1) - i] = temp;

        }
    }

    //rotating the array by one bit
    public static int[] rightRoatateByOneNo(int[] a, int n) {
        //n --> bo of bits
        //storing the rightmost bit
        int temp = a[n - 1];
        for (int i = n - 1; i >= 1; i--) {
            // rightshifing each element
            a[i] = a[i - 1];
        }
        a[0] = temp;
        return a;
    }

    //print the repeated nos in array
    public static void printDuplicates(int arr[]) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    counter++;

                }
            }
            if (counter == 1)
                System.out.println(arr[i]);
            counter = 0;
        }

    }

    //Find the odd and even numbers of an array in two separate arrays
    public static void evenOdd(int[] a) {
        int[] even, odd;
        if (a.length % 2 == 0) {
            even = new int[a.length / 2];
            odd = new int[a.length / 2];
        } else {
            even = new int[a.length / 2];
            odd = new int[a.length / 2 + 1];
        }
        for (int i = 1; i < a.length; i += 2) {
            even[(i - 1) / 2] = a[i];
        }
        for (int i = 0; i < a.length; i += 2) {
            odd[(i) / 2] = a[i];
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(even));
        System.out.println(Arrays.toString(odd));
    }

    //Rotate an array by k positions.
    public static void rotateArrayByNBits(int[] m, int k) {
        int[] n = new int[m.length];
        for (int i = 0; i < k; i++) {
            m = rightRoatateByOneNo(m, m.length);
            System.out.println(Arrays.toString(m));
        }
        System.out.println(Arrays.toString(m));

    }

    //merge the two sorted array without duplicates
    public static void merge(int[] arr1, int[] arr2) {
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i+1; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    count++;
                }
            }
        }
        int i = 0, j = 0, k = 0;
        int n1 = arr1.length, n2 = arr2.length;
        int[] arr3 = new int[n1 + n2];

        // Traverse both array
        while (i < n1 && j < n2) {
            // Check if current element of first
            // array is smaller than current element
            // of second array. If yes, store first
            // array element and increment first array
            // index. Otherwise do same with second array
            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
        }

        // Store remaining elements of first array
        while (i < n1)
            arr3[k++] = arr1[i++];

        // Store remaining elements of second array
        while (j < n2)
            arr3[k++] = arr2[j++];
        int n = arr3.length;
        int[] temp = new int[n];

        // Start traversing elements
        j = 0;
        for (i = 0; i < n - 1; i++)
            // If current element is not equal
            // to next element then store that
            // current element
            if (arr3[i] != arr3[i + 1])
                temp[j++] = arr3[i];

        // Store the last element as whether
        // it is unique or repeated, it hasn't
        // stored previously
        temp[j++] = arr3[n - 1];
        int[] xxx = new int[n - count];
        // Modify original array
        for (int z = 0; z < n - count; z++)
            xxx[z] = temp[z];

        System.out.println(Arrays.toString(xxx));
    }

    // Method to find two numbers that are occurring odd number of times.
    static void twoOddOccurringElements(int arr[], int n) {
        // to store XOR of all elements
        int XOR = 0;
        // But XOR will store XOR of 2 numbers that occurred odd number of times because XOR of 2 same numbers is 0
        for (int i = 0; i < n; i++) {
            XOR = XOR ^ arr[i];
        }
        // Getting rightmost set bit of XOR
        int setBit = XOR & (~(XOR - 1));
        // Dividing the elements into 2 sets
        // Set1: Elements having bit 1 in corresponding to setBit position
        // Set2: Elements having bit 0 in corresponding to setBit position
        int x = 0, y = 0;
        for (int i = 0; i < n; i++) {
            if ((arr[i] & setBit) > 0)
                // holds odd occurring number with bit 1 in corresponding to setBit position
                x = x ^ arr[i];
            else
                // holds odd occurring number with bit 0 in corresponding to setBit position
                y = y ^ arr[i];
        }
        // Printing two numbers that occurred odd number of times
        if (x < y)
            System.out.println(x + " " + y);
        else
            System.out.println(y + " " + x);
    }

    //Merge two arrays
    public static void merged(int[] a, int[] b) {
        int n1 = a.length;
        int n2 = b.length;
        int i = 0, j = 0;
        int count = 0;
        for (int x = 0; x < n1; x++)
            for (int y = 0; y < n2; y++) {
                if (a[x] == b[y])
                    count++;
            }
        System.out.println(count);
        int n3 = n1 + n2 - count;
        int k = 0;
        int[] mer = new int[10];
        while ((i < n1) && (j < n2)) {
            if (a[i] < b[j]) {
                mer[k++] = a[i++];
            } else if (b[j] < a[i]) {
                mer[k++] = b[j++];
            } else {
                mer[k++] = a[i++];
                j++;
            }
        }
        while (i < n1) {
            mer[k++] = a[i++];
        }
        while (j < n2)
            mer[k++] = b[j++];
        System.out.println(Arrays.toString(mer));
    }

}



