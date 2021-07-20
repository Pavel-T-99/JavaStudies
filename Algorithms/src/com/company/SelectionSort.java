package com.company;

public class SelectionSort implements SortAlgorithm{

    @Override
    public <T extends Comparable<T>> T[] sort(T[] array){
        int n = array.length;
        for(int i = 0; i < n - 1; i++){
            int midIndex = i;
            for(int j = i+1; j < n; j++){
                if(array[midIndex].compareTo(array[j]) > 0){
                    midIndex = j;

                }
            }
            if(midIndex != i ){
                T temp = array[i];
                array[i] = array[midIndex];
                array[midIndex] = temp;
            }

        }
        return array;
    }

}
