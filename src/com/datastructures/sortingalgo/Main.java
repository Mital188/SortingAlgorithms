package com.datastructures.sortingalgo;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] intArray = {0,2,4,3,5,6,1,9,0};

        //Implements Bubble Sort
        BubbleSort bubble = new BubbleSort();
        System.out.println("Bubble Sort");
        print(bubble.sort(intArray));
        System.out.println("\nBubble Sort using Shell");
        print(bubble.shellSort(intArray));

        //Implements Selection Sort
        SelectionSort selection = new SelectionSort();
        System.out.println("\nSelection Sort");
        print(selection.sort(intArray));

        //Implements Insertion Sort
        InsertionSort insertion = new InsertionSort();
        System.out.println("\nInsertion Sort");
        print(insertion.sort(intArray));

        //Implements Shell Sort
        ShellSort shell = new ShellSort();
        System.out.println("\nShell Sort");
        print(shell.sort(intArray));

        //Implementing Merge sort
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(intArray,0, intArray.length);
        System.out.println("\nMerge Sort");
        print(intArray);

        //Implementing Quick sort
        QuickSort quickSort = new QuickSort();
        System.out.println("\nQuick Sort");
        quickSort.sort(intArray,0, intArray.length);
        print(intArray);

    }

    public static void print(int[] array){
        for(int i =0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
    }
}
