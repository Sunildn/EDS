package BuldingBlock;

import java.util.Arrays;

public class SortingAlgorithm {
    //--------------------------------------------------------------------
    /*Sorting means arranging the nos in order
    -->Time complexity :
    -->Stability:index value should be in same order after sorting
    -->In-space: occupy the same memory space after sorting as in the original
        unsorted array and which requires a small constant amount of extra space
        for manipulating the input array
      We usually use two brute force sorting algorithms:
        • Bubble sort, and
        • Selection sort.
     */
    //-------------------------------------------------------------------
    //Bubble Sort :stable and O(n^2)
    public static void bubbleSort(int[] arr){
        // ascending order
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }}
        //    System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }
    //Selection sort: unstable and O(n^2)
    public static void selectionSort(int[] arr){
        int minIndex=0,minValue=arr[0];
        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<minValue){
                    minValue=arr[j];
                    minIndex=j;
                }
            }int temp =arr[i];
            arr[i]=minValue;
            arr[minIndex]=temp;
            //System.out.println(Arrays.toString(arr));

        }
        System.out.println(Arrays.toString(arr));
    }
    //Insertion sort:stable
    public static void insertionSort(int[] arr){

        for(int i=1;i<arr.length;i++){
            int pivot=arr[i];
            int j=i-1;
            while((j>=0)&&(pivot<arr[j])){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=pivot;
        }
        System.out.println(Arrays.toString(arr));
    }

}
