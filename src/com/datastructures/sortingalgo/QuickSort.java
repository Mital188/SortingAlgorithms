package com.datastructures.sortingalgo;

public class QuickSort {
    public void sort(int[] array, int start, int end){

        if((end - start)<2)
            return;

        int pivot = partition(array,start,end);
        sort(array,start,pivot);
        sort(array,pivot+1,end);
    }
    public int partition(int[] array, int start, int end){

        int pivot = array[start];
        int i = start;
        int j = end;

        while(i<j){
            //Empty loop
            while (i<j && array[--j] >= pivot);
            if(i<j){
                array[i] = array[j];
            }
            //Empty loop
            while (i<j && array[++i]<=pivot);
            if(i<j){
                array[j] = array[i];
            }
        }
        array[j] = pivot;
        return j;
    }
}
