package com.company.algorithms;

public class InsertionSort {

    public static void insertionSort(int[] array){

        for(int i = 1; i < array.length; i++){

            for(int j = i; j > 0; j--){

                if(array[j] < array[j-1]){
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;

                }
            }

            }
        }


    public static void recursiveInsertionSort(int[] array, int start){

        if(start > array.length-1)return;
        else{
            for(int i = start; i > 0; i--){
                if(array[i] < array[i-1]){
                    int temp = array[i];                //5 1   4 2   3 3  2 4        4 1  3 2
                    array[i] = array[i-1];
                    array[i-1] = temp;
                }
            }
            start++;
            recursiveInsertionSort(array, start);
        }
    }
}

