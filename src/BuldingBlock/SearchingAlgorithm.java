package BuldingBlock;
import com.demp.*;
import java.util.Arrays;

public class SearchingAlgorithm {
    //linear search
    public static int linearSearch(int[] a, int key) {
        //using for loop
        int i = 0;//for finding the index
        for (i = 0; i < a.length; i++) {
            if (key == a[i])
                System.out.println("key" + key + " found at :" + i);
        }
        return i;
    }

    //Binary search
    public static void binarySearch(int[] a, int key) {
        int l = 0, h = a.length - 1;
        boolean found = false;

        while (h >= l) {
            int m = (l + h) / 2;
            if (a[m] < key) {
                l = m + 1;
            } else
                h = m - 1;
            if (a[m] == key) {
                found = true;
            }
        }
        if (found)
            System.out.println("keyfound");
        else
            System.out.println("key not found");
    }

    //Binary search using Recursion
    public static void recursionBinarySearch(int[] a, int key, int low, int high) {
        //set low and high indices
        int l = low, h = high;

        if (l > h) {
            System.out.println("Not Found");
            return;
        }
        int mid = (l + h) / 2;
        if (a[mid] == key) {
            System.out.println("key found");
        }
        if (a[mid] < key) {
            recursionBinarySearch(a, key, mid + 1, h);
        }
        if (a[mid] > key) {
            recursionBinarySearch(a, key, l, mid - 1);
        }
    }

    //Finding the smallest missing element from the sorted array of n distinct elements.
    //Elements are in the range of 0 to m-1, where m>n.
    public static void missingNo(int[] a, int start, int end) {
        int mid = (start + end) / 2;
        if (start > end) {
            System.out.println("no such element found");
        }
        if (start != a[start])
            System.out.println("missing found" + start);
        if (mid == a[mid]) {
            missingNo(a, mid + 1, end);
        } else
            missingNo(a, start, mid);
    }

    //To find the median of two sorted arrays;
    public static float medianOfArray(int[] a, int[] b) {
        float median1 = 0, median2 = 0, median = 0;
        int l1 = a.length, l2 = b.length;
        if (a.length % 2 == 0) {
            median1 = (float) (a[l1 / 2] + a[(l1 / 2) - 1]) / 2;
        } else
            median1 = a[l1 / 2];
        if (b.length % 2 == 0) {
            median2 = (float) (b[l2 / 2] + a[(l2 / 2) - 1]) / 2;
        } else
            median2 = b[l2 / 2];
        median = (median1 + median2) / 2;
        return median;
    }

    //Merge two arrays and find median
    static int mergeAndMedian(int arr1[], int[] arr2) {
        int n1=arr1.length,n2=arr2.length;
        int n=(n1+n2);

        int[] merged =new int[n];
        for(int i=0;i<n1;i++){
            merged[i]=arr1[i];
        }
        for(int i=n1,j=0;(i<n)&&(j<n2);i++,j++){
            merged[i]=arr2[j];
        }
    Arrays.sort(merged);
        int median;
   if(n%2==0){
       median =(merged[n/2]+merged[(n/2)-1])/2;
        }else
            median=(merged[n/2]);
return median;
    }
    //count frequency of a no in Array
    static int countFreq(int arr[], int size, int num) {
        int start = 0, end = size - 1;
        int count = 0;
        while (end >= start) {
            int mid = (start + end) / 2;
            if (arr[mid] > num) {
                end = mid - 1;
            } else
                start = mid + 1;
            if (arr[mid] == num) {
                count++;
                if (arr[mid - 1] == num) {
                    while (arr[mid - 1] == num)
                        count++;
                    mid--;
                }
                if (arr[mid + 1] == num) {
                    while (arr[mid + 1] == num)
                        count++;
                    mid++;
                }
            }


        }return count;

    }

}
