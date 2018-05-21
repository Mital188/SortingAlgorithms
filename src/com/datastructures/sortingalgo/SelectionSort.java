package com.datastructures.sortingalgo;

public class SelectionSort {
    public int[] sort(int[] array){
        for(int i =array.length-1; i>=0;i--){
            int large = 0;
            for(int j = 1 ; j <= i;j++){
                if(array[large] < array[j])
                    large = j;
            }
            swap(array,large,i);
        }
        return array;
    }

    public void swap(int [] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
