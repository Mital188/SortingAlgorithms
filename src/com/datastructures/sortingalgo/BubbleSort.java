package com.datastructures.sortingalgo;

public class BubbleSort {
    public int[] sort(int[] array){
        for(int i = array.length -1; i>=0; i--){
            for(int j=0;j <i;j++){
                if(array[j] > array[j+1])
                    swap(array,j,j+1);
            }
        }
        return array;
    }

    public int[] shellSort(int[] array){

        for(int gap = array.length/2; gap>0; gap/=2){
            for(int i  = array.length -1; i>=0; i--){
                for(int j=0;j <= i-gap ;j+=gap){
                    if(array[j] > array[j+gap])
                        swap(array,j,j+gap);
                }
            }
        }
        return array;
    }

    public void swap(int[] array, int i,int j){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
    }
}
