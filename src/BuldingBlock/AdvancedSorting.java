package BuldingBlock;

import java.util.Arrays;

public class AdvancedSorting {
//time complexity of merge sort is O(n*log(n))
    public static void mergeSort(int[] arr){
    // in merge sort array is divided into one element and merge task is done
        int n=arr.length;
        if(n==1)
            return;
        // 1.divide
        int mid=n/2;
        int[] left =new int[mid];
        int[] right= new int[n-mid];
        for(int i=0;i<mid;i++){
            left[i]=arr[i];
        }
        for(int j=mid;j<n;j++){
            right[j-mid]=arr[j];
        }
        //2.Conquer
        mergeSort(left);
        mergeSort(right);
        //3.Combine
        merge(arr,left,right);
    }
    public static void merge(int[] arr,int[] left,int[] right) {
     //Only sorted tow arrays is merged
        int l = left.length;
        int r = right.length;
        int i = 0, j = 0, k = 0;//keep a track on index of all the array
        while ((i < l) && (j < r)) {//if one of the array reaches the end
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else
                arr[k++] = right[j++];
        }
        //put the remaining elements of the left or right to main array
        //right got exhausted
        while (i < l)
            arr[k++] = left[i++];
        //left got exhausted
        while (j < r)
            arr[k++] = right[j++];
        System.out.println(Arrays.toString(arr));
    }

//worst-->O(n)  Best-->O(n*log(n))
    public static void quickSort(int[] arr,int start,int end){
        if(start<end){
        //magic takes the last value as pivot and gives the index
        //where the pivot was inserted
            int p=magic(arr,start,end);
         //split the array before the and after the pivot index
            quickSort(arr,start,p-1);
            quickSort(arr,p+1,end);
        }
    }
    public static int magic(int[] arr,int start,int end) {


        //3 2 4 5 1 6 3
    // i sj        pivot
    //    3 2 1| 5 4 6|3
    //    s   i      j pivot
        int i = -1;
        int j = 0;
        int pivot = end-1;
        for (j = start; j < end; j++) {
     //2.  i>if the element is larger then ignore and go because j is incremented in the loop
     //    ii>if the element is lesser then swap the i+1 element with j
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
            int temp = arr[i + 1];
            arr[i + 1] = arr[pivot];
            arr[pivot] = temp;
            return i + 1;
        }

}
