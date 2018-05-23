package com.datastructures.sortingalgo;

public class CountingSort {

    public void sort(int[] array, int start, int end){
        if((end - start)<1)
            return;
        int [] temp = new int[end-start+1];

        for(int i = 0; i< array.length;i++){
            temp[array[i]- start]++;
        }
        int index =0;
        for(int i = 0; i< temp.length;i++){
            if(temp[i]>0){
                for(int j = 0;j<temp[i];j++){
                    array[index++] = i;
                }
            }
        }



    }

}
