package com.company.algorithms;

public class SelectionSort {
    public static void selectionSort(int[] array) {

        int boundry = array. length;
        while(boundry > 1) {
            int largestPos = 0;
            for(int i = 1; i < boundry - 1; i++){

                if(array[i] > array[largestPos]){
                    largestPos = i;
                }
            }

            boundry--;

            int temp = array[largestPos];
            array[largestPos] = array[boundry];
            array[boundry] = temp;

        }

    }

    public static void recursiveSelectionSort(int[] array, int size){
        int boundry = size;

        if(boundry == 1) return;
        else{
            int largestPos = array[0];

            for(int i = 1; i < boundry - 1; i++ ){
                if(array[i] > array[largestPos]){
                    largestPos = i;
                }
            }

            boundry--;
            int temp = array[largestPos];
            array[largestPos] = array[boundry];
            array[boundry] = temp;

            recursiveSelectionSort(array, boundry);
        }
    }
}
