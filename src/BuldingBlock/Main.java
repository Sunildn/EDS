package BuldingBlock;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] a= {1,2,3,4,4,5};
        int[] b={3,2,7,4,8,9,1};
        int [] c= new int[12];
        AdvancedSorting.quickSort(b,0,b.length-1);
        System.out.println(Arrays.toString(b));
//--------------------------------------------------------------
//                 Searching Algorithm
//--------------------------------------------------------------
//  SearchingAlgorithm.linearSearch(a,7);
//  SearchingAlgorithm.binarySearch(a,1);
//  SearchingAlgorithm.recursionBinarySearch(a,9,0,a.length-1);
//  System.out.println(SearchingAlgorithm.medianOfArray(a,b));
//  SearchingAlgorithm.mergeAndMedian(a,b);
//--------------------------------------------------------------
//                  Sorting Algorithm
//--------------------------------------------------------------
//  SortingAlgorithm.bubbleSort(a);
//  SortingAlgorithm.selectionSort(a);
//  SortingAlgorithm.insertionSort(a);
//--------------------------------------------------------------
//                   Advanced Sorting
//--------------------------------------------------------------
//AdvancedSorting.merge(c,a,b);

    }
    }


