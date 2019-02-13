package com.company.algorithms;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        int[] test = {1, 5 , 7, 2, 4, -1};

//        SelectionSort.recursiveSelectionSort(test, test.length);
//        InsertionSort.insertionSort(test);
        ShellSort.shellSort(test);


        System.out.println(Arrays.toString(test));
//        System.out.println(MinimumElement.returnMin(test));
    }

    private static void bubbleSort(int[] array) {
        int boundry = array.length;

        while(boundry > 1){
            for(int i = 0; i < boundry - 1; i++){
                if(array[i] > array[i+1]) {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }

            }
            boundry--;

        }

    }

    private static void recursiveBubbleSort(int[] array, int size){
        int boundry = size;
        System.out.println(boundry);
        if(boundry == 1) return;
        else {
            for(int i = 0; i < boundry -1; i++){
                if(array[i] > array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }

            }
            boundry--;
            recursiveBubbleSort(array, boundry);
        }
    }
}
