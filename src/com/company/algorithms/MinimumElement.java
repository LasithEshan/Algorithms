package com.company.algorithms;

public class MinimumElement {
    public static int returnMin(int[] array){
        int min = array[0];

        for(int i= 1; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
