package com.datastructures.sortingalgo;

public class InsertionSort {
    public int[] sort(int[] array){
        for(int i=0;i<array.length-1;i++){
            int temp = array[i+1];
            int pos = i+1;
            for(int j= i; j>=0 ;j--){
                if(temp < array[j]){
                    array[pos] = array[j];
                    pos --;
                }else{
                    array[pos] = temp;
                }
                if(pos == 0)
                    array[0] = temp;
            }
        }
        return array;
    }
}
