package com.datastructures.sortingalgo;

public class MergeSort {
    public void mergeSort(int[] array, int start, int end){
        if((end - start) < 2)
            return;

        int mid = (start + end)/2;

        mergeSort(array,start,mid);
        mergeSort(array,mid,end);
        merge(array,start,mid,end);


    }
    public void merge(int[] array, int start, int mid, int end){

        if(array[mid-1] <= array[mid])
            return;

        int i = start;
        int j = mid;
        int index = 0;

        int[] tempArray = new int[end-start];

        while(i < mid && j < end){
            tempArray[index++] = array[i] <= array[j]? array[i++]: array[j++];
        }
        System.arraycopy(array,i,array,start+index,mid-i);
        System.arraycopy(tempArray,0,array,start,index);

    }
}
