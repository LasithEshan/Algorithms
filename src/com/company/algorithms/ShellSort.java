package com.company.algorithms;

public class ShellSort {

    public static void shellSort(int[] array){

        int k = array.length/3;
        int gap = calculateGap(k);
        while(gap > 0){
            for(int i = gap; i < array.length; i += gap ){

                for(int j = i; j > 0; j -= gap ){

                    if(array[j] < array[j - gap]){
                        int temp = array[j];
                        array[j] = array[j - gap];
                        array[j - gap] = temp;
                    }
                }

            }
            k--;
           gap = calculateGap(k);
        }


    }

    private static int calculateGap(int key){
        if(key > 0) {
            return  ((int) Math.pow(3, key) - 1) / 2;
        }else return key;
    }
}
