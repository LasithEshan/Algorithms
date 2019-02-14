package com.company.algorithms;

public class MergeSort {

    static void mergeSort(int[] array, int start, int end){

        if(start < end){
            int mid = (start + end)/2;

            mergeSort(array, start, mid);
            mergeSort(array, mid+1, end);
            merge(array, start, mid, end);

        }
    }

    private static void merge(int[] array, int start, int mid, int end) {


        if(array[mid] < array[mid+1]) return;

        int[] temp = new int[end - start +1];
        int i = start;
        int j = mid +1;
        int k = 0;

        while(i <= mid && j <= end){

            if(array[i] < array[j]){
                temp[k] = array[i];
                k++;
                i++;
            }else{
                temp[k] = array[j];                 // 5  6  7      3  8       3  5  6  7
                j++;
                k++;
            }

        }

        while(i <= mid){
            temp[k] = array[i];
            k++;
            i++;
        }

        while(j <= end){
            temp[k] = array[i];
            k++;
            j++;
        }

        for(int l = start ; l <= end; l++){
            array[l] = temp[l - start];

        }












     }
}
