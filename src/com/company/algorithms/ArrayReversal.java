package com.company.algorithms;

public class ArrayReversal {
    static int[] intArrayReversal(int[] array){
        int start = 0;
        int end   = array.length -1;//3

        while(start < end){
            int backup = array[start];//1   2
            array[start] = array[end];//8   5
            array[end] = backup;//      1   2

            start++;//1  2   3
            end --;//2    1
        }

        return array;
    }

    static void recursiveIntArrayReversal(int[] array, int start, int end ){

        if(start < end) {
            return;
        }

        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;

        recursiveIntArrayReversal(array, start++, end--);


    }

}
