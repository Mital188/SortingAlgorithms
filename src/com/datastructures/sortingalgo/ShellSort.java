package com.datastructures.sortingalgo;

public class ShellSort {
    public int[] sort(int[] array){
        for(int gap = array.length/2; gap > 0; gap/=2) {
            for (int i = gap; i < array.length; i++) {
                int temp = array[i];
                int j = i;

                while(j>= gap && array[j-gap]>temp){// If less than gap, then we hit the front of array
                        array[j] = array[j-gap];
                        j-=gap;
                }
                array[j] = temp;
            }
        }
        return array;
    }
}
